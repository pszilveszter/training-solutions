package ioreadbytes.bytematrix;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {
    private static final int SIZE = 1000;
    private List<byte[]> byteArrays = new ArrayList<>();

    public List<byte[]> getMyMatrix() {
        return new ArrayList<>(byteArrays);
    }

    public void readBytesAndCreateMatrix(String fileName) {
        Path path = Path.of(fileName);
        try (InputStream stream = new BufferedInputStream(Files.newInputStream(path))) {
            byte[] data = new byte[SIZE];
            int size;
            while ((size = stream.read(data)) > 0) {
                byteArrays.add(data);
                data = new byte[SIZE];
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file", ioe);
        }
    }

    public int numberOfColumnsWhereMoreZeros() {
        //Hibás teszt, az állományban 499 olyan oszlop van melyben t9bb a nullák száma
        //Tesztelve az Examples és a Solutions mappák file-jaival is, ugyanaz az eredmény
        //A "Solution" alatt lévő megoldás éppógy nem múködik...
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            int countZero = 0;
            for (byte[] data: byteArrays) {
                if ((byte)'0' == data[i]) {
                    countZero++;
                }
            }
            if (countZero > byteArrays.size() / 2) {
                count++;
            }
        }
        return count;
    }
}
