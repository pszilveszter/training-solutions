package week09d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SantaClausTest {

    @Test
    void testAged14up() {
        // given
        SantaClaus sc = new SantaClaus(Arrays.asList(new Person("Fiatal", 13),new Person("Felnőtt", 18)));

        // when
        sc.getThroughChimneys();

        // then
        List<Person> personWithPresent = new ArrayList<>();
        for (Person person : sc.getPersons()) {
            if (person.getPresent() != null) {
                personWithPresent.add(person);
            }
        }
        assertEquals(1, personWithPresent.size());
        assertEquals(13, personWithPresent.get(0).getAge());
        assertEquals("Fiatal", personWithPresent.get(0).getName());
        assertTrue(personWithPresent.get(0).getPresent().ordinal() < 4);
    }

}