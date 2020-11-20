package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {

    @Test
    void removeAccent() {
        assertEquals('a', new WithoutAccents().removeAccent('á'));
        assertEquals('e', new WithoutAccents().removeAccent('é'));
        assertEquals('i', new WithoutAccents().removeAccent('í'));
        assertEquals('o', new WithoutAccents().removeAccent('ó'));
        assertEquals('o', new WithoutAccents().removeAccent('ö'));
        assertEquals('o', new WithoutAccents().removeAccent('ő'));
        assertEquals('u', new WithoutAccents().removeAccent('ú'));
        assertEquals('u', new WithoutAccents().removeAccent('ü'));
        assertEquals('u', new WithoutAccents().removeAccent('ű'));
    }

    @Test
    void removeAccentCapital() {
        assertEquals('A',new WithoutAccents().removeAccent('Á'));
        assertEquals('E',new WithoutAccents().removeAccent('É'));
        assertEquals('I',new WithoutAccents().removeAccent('Í'));
        assertEquals('O',new WithoutAccents().removeAccent('Ó'));
        assertEquals('O',new WithoutAccents().removeAccent('Ö'));
        assertEquals('O',new WithoutAccents().removeAccent('Ő'));
        assertEquals('U',new WithoutAccents().removeAccent('Ú'));
        assertEquals('U',new WithoutAccents().removeAccent('Ü'));
        assertEquals('U',new WithoutAccents().removeAccent('Ű'));
    }

    @Test
    void keepOriginal() {
        assertEquals('A',new WithoutAccents().removeAccent('A'));
        assertEquals('e',new WithoutAccents().removeAccent('e'));
        assertEquals('f',new WithoutAccents().removeAccent('f'));
        assertEquals('G',new WithoutAccents().removeAccent('G'));
    }
}