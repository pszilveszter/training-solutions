package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GentlemanTest {

    @Test
    void verifyHello() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String hello = gentleman.sayHello("Teszt Elek");

        // Then
        //assertEquals(hello, equalTo("HelloTeszt Elek"));
        assertEquals("HelloTeszt Elek",hello);
    }


    // hibás program jelzée: A Run Tool ablak ban illetve a test kódjában pirossal aláhúzva
    // hibás teszt: ha a gentleman-ra ellenőriz akkor ugyanott mint a hibás program, ha rosz metódus pl == akkor fordítási hiba
    // Az új ág lefedettségét a line% mutatja, illetve a megfeleő osztályban pirossal színezi  a sor elejét

    @Test
    void verifyHelloNull() {
        //assertThat(new Gentleman().sayHello(null),equalTo("HelloAnonymus"));
        assertEquals("HelloAnonymus", new Gentleman().sayHello(null));
    }

    // Bonusz1:
    // Maven ide fordítja a teszt fájlokat: .target.test-classses.package.class
    // Maven ide teszi a legutóbbi test futtatás eredményét:  .target.surfire-reports txt és xml állományok formájában

    //Bonusz 2
    // mvn clean package -Dmaven.test.skip=true

    //Bonusz 3
    //Kent Beck, Erich Gamma, David Saff, Kris Vasudevan
    // 2002. Test-Driven Development by Example ISBN 978-0321146533
    // 2008. Implementation Patterns ISBN 978-0321413093

    // Bonusz 4
//    @Test
//    public void badTest() {
//        assertThat(new Gentleman().sayHello(null) == ("HelloAnonymus"));
//    }
    // BUILD FAILURE Failed to execute goal testCompile >> kvázi a tesz elhasalása révén nem végzi el a JAR file-ba történő tömörítést
}