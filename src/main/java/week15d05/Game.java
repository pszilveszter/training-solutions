package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Game {

    private List<House> houses = new ArrayList<>();


    public House getMostInvolved(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            readFile(reader);

            return Collections.max(houses, new Comparator<House>() {
                @Override
                public int compare(House o1, House o2) {
                    return o1.getBattles().size() - o2.getBattles().size();
                }
            });
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file", ioe);
        }
    }


    private void readFile(BufferedReader reader) throws IOException {
        reader.readLine();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",", 25);
            Battle battle = createBattle(data[0], data[2], data[13]);
            battle.addAttackers(readHouses(battle, Arrays.copyOfRange(data, 5, 9)));
            battle.addDefenders(readHouses(battle, Arrays.copyOfRange(data, 9, 13)));
        }
    }


    private List<House> readHouses(Battle battle, String[] houseNames) {
        List<House> involvedHouses = new ArrayList<>();
        int index = 0;

        while (index < houseNames.length && !houseNames[index].isBlank()) {
            House house = new House(houseNames[index]);
            if (!houses.contains(house)) {
                houses.add(house);
            }

            house = houses.get(houses.indexOf(house));
            if (!battle.getHouses().contains(house)) {
                involvedHouses.add(house);
                house.addBattle(battle);
            }
            index++;
        }
        return involvedHouses;
    }


    private Battle createBattle(String name, String number, String winnerStr) {
        switch (winnerStr) {
            case "win":
                return new Battle(name, number, Winner.ATTACKERS);
            case "loss":
                return new Battle(name, number, Winner.DEFENDERS);
            default:
                return new Battle(name, number);
        }
    }

}