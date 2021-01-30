package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private List<Band> bands = new ArrayList<>();

    public void readBandsFromFile(Path inputFile) {
        try (BufferedReader reader = Files.newBufferedReader(inputFile)) {
            String strBand;
            while ((strBand = reader.readLine()) != null) {
                String name = strBand.split(";")[0];
                int year = Integer.parseInt(strBand.split(";")[1]);
                bands.add(new Band(name, year));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file " + inputFile.toString(), ioe);
        }
    }

    public void writeBandsBefore(Path outputFile, int yr) {
        try (BufferedWriter writer = Files.newBufferedWriter(outputFile)) {
            for (Band band: bands) {
                if (yr > band.getYear()) {
                    writer.write(band.getName());
                    writer.write(";");
                    writer.write(band.getYear());
                    writer.newLine();
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file " + outputFile.toString());
        }
    }
}
