package controlselection.greetings;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @Test
    void test0500() {
        // Given
        Greetings gr = new Greetings();

        // When
        String greeting = gr.greeting(LocalTime.of(5, 0));

        // Then
        assertEquals("Jó éjt",greeting);
    }

    @Test
    void test0501() {
        // Given
        Greetings gr = new Greetings();

        // When
        String greeting = gr.greeting(LocalTime.of(5, 1));

        // Then
        assertEquals("Jó reggelt",greeting);
    }

    @Test
    void test0900() {
        // Given
        Greetings gr = new Greetings();

        // When
        String greeting = gr.greeting(LocalTime.of(9, 0));

        // Then
        assertEquals("Jó reggelt",greeting);
    }

    @Test
    void test0901() {
        // Given
        Greetings gr = new Greetings();

        // When
        String greeting = gr.greeting(LocalTime.of(9, 1));

        // Then
        assertEquals("Jó napot",greeting);
    }

    @Test
    void test1830() {
        // Given
        Greetings gr = new Greetings();

        // When
        String greeting = gr.greeting(LocalTime.of(18, 30));

        // Then
        assertEquals("Jó napot",greeting);
    }

    @Test
    void test1831() {
        // Given
        Greetings gr = new Greetings();

        // When
        String greeting = gr.greeting(LocalTime.of(18, 31));

        // Then
        assertEquals("Jó estét",greeting);
    }

    @Test
    void test2000() {
        // Given
        Greetings gr = new Greetings();

        // When
        String greeting = gr.greeting(LocalTime.of(20, 0));

        // Then
        assertEquals("Jó estét",greeting);
    }

    @Test
    void test2001() {
        // Given
        Greetings gr = new Greetings();

        // When
        String greeting = gr.greeting(LocalTime.of(20, 1));

        // Then
        assertEquals("Jó éjt",greeting);
    }
}