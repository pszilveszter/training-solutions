package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {
    private final List<Production> productions = new ArrayList<>();
    private final List<Vote> votes = new ArrayList<>();

    public List<Production> getProductions() {
        return new ArrayList<>(productions);
    }

    public List<Vote> getVotes() {
        return new ArrayList<>(votes);
    }

    public void readTalents(Path talentsFile) {
        try (BufferedReader reader = Files.newBufferedReader(talentsFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                productions.add(new Production(id, name));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file " + talentsFile.toString());
        }
    }

    public void calculateVotes(Path votesFile) {
        try {
            List<String> strVotes = Files.readAllLines(votesFile);
            for (String strVote: strVotes) {
                Vote vote = getExistingVote(Integer.parseInt(strVote));
                if (vote == null) {
                    votes.add(new Vote(Integer.parseInt(strVote), 1));
                } else {
                    vote.incNum();
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file " + votesFile.toString());
        }

    }

    public void writeResultToFile(Path resultFile) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(resultFile))) {
            for (Vote vote: votes) {
                writer.print(vote.getId());
                writer.print(" " + getProductName(vote.getId()));
                writer.println(" " + vote.getNumber());
            }
            writer.print("Winner: ");
            writer.println(getProductName(getWinnerId()));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file " + resultFile.toString());
        }
    }

    private Vote getExistingVote(int voteId) {
        for (Vote v: votes) {
            if (voteId == v.getId()) {
                return v;
            }
        }
        return null;
    }

    private String getProductName(int id) {
        for (Production production: productions) {
            if (id == production.getId()) {
                return production.getName();
            }
        }
        throw new IllegalArgumentException("Invalid VoteId " + id);
    }

    private int getWinnerId () {
        int max = 0;
        int id = 0;
        for (Vote vote: votes) {
            int number = vote.getNumber();
            if (max < number) {
                max = number;
                id = vote.getId();
            }
        }
        return id;
    }
}
