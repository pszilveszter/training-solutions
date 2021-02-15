package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {

    public void saveTransactions(Path path, List<Transaction> transactions) {
        try (ZipOutputStream os = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            for (Transaction tr: transactions) {
                os.putNextEntry(new ZipEntry(tr.getId() + ""));
                StringBuilder content = new StringBuilder();
                content.append(tr.getTime() + "\n");
                content.append(tr.getAccount() + "\n");
                content.append(tr.getAmount());
                os.write(content.toString().getBytes());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file", ioe);
        }
    }
}
