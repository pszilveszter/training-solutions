package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<BankAccount> accountList = new ArrayList<>();

    public List<BankAccount> getAccountList() {
        return List.copyOf(accountList);
    }


    public void uploadListFromFile(String path) {
        if (path == null || path.isBlank()) {
            throw new IllegalArgumentException("Invalid file source");
        }
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            if (lines.isEmpty()) {
                throw new IllegalArgumentException("Empty file");
            }
            for (String line : lines) {
                processLine(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void makeTransactions(String path) {
        uploadListFromFile(path);
    }


    private void processLine(String line) {
        String[] data = line.split(";");
        switch (data.length) {
            case 3:
                fillAccountList(data);
                break;
            case 2:
                processTransations(data);
                break;
            default:
                throw new IllegalArgumentException("Corrupt data: " + line);
        }
    }


    private void processTransations(String[] lineTransaction) {
        try {
            String trAccount = lineTransaction[0];
            double trAmmount = Double.parseDouble(lineTransaction[1]);
            for (BankAccount ba : accountList) {
                if (trAccount.equals(ba.getAccountNumber())) {
                    ba.setBalance(trAmmount);
                    break;
                }
            }
        } catch (NumberFormatException nfo) {
            throw new IllegalArgumentException("Unable to parse balance: " + lineTransaction[1]);
        }

    }


    private void fillAccountList (String[] lineAccount) {
        try {
            double readBalance = Double.parseDouble(lineAccount[2]);
            accountList.add(new BankAccount(lineAccount[0], lineAccount[1], readBalance));
        } catch (NumberFormatException nfo) {
            throw new IllegalArgumentException("Unable to parse balance: " + lineAccount[2]);
        }
    }

}
