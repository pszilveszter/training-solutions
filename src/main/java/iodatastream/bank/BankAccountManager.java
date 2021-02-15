package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {

    public void saveAccount(BankAccount account, Path folder) {
        Path file = folder.resolve(account.getAccountNumber() + ".dat");
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))) {
            dos.writeUTF(account.getAccountNumber());
            dos.writeUTF(account.getOwner());
            dos.writeDouble(account.getBalance());
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file", ioe);
        }
    }


    public BankAccount loadAccount(InputStream is) {
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(is))) {
            String accountNr = dis.readUTF();
            String name = dis.readUTF();
            double balance = dis.readDouble();
            return new BankAccount(accountNr, name, balance);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file", ioe);
        }


    }



}
