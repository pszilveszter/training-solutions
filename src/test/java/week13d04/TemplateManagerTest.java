package week13d04;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemplateManagerTest {

    TemplateManager tm = new TemplateManager();
    Path p = Path.of(this.getClass().getPackageName()).resolve("employees.txt");

    @Test
    void testMergeNew() throws IOException {
        String content = Files.readString(p);
        assertEquals(content, tm.merge(p, new ArrayList<>()));
    }


    @Test
    void testMergeAppend() throws IOException {
        Employee e1 = new Employee("Rend Őrs", "1999");
        List<Employee> es = List.of(e1);

        String content1 = "Az alkalmazott neve: Rend Őrs, születési éve: 1999\r\n";
        String content2 = Files.readString(p);
        assertEquals(content1 + content2, tm.merge(p, es));
    }

}