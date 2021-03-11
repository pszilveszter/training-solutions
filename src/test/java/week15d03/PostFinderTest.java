package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    Post p1 = new Post("Javából", LocalDate.of(2000, 1, 1), "Vizsgázni Java programozásból", "Pintér Szilveszter");
    Post p2 = new Post("Recept", LocalDate.of(2020, 1, 1), "Hogyan főzzünk Java-val", "Pintér Szilveszter");
    Post p3 = new Post("Impossible mission", LocalDate.of(2100, 1, 1), "Még mindíg élek", "Pintér Szilveszter");
    Post p4 = new Post("Soha", LocalDate.of(2000, 1, 1), "Soha ne mondd, hogy soha", "Valaki más");

    @Test
    void testFindPostsFor() {
        // Given
        PostFinder pf = new PostFinder(List.of(p4, p3, p2, p1));
        assertEquals(4, pf.getPosts().size());

        // When
        List<Post> posts = pf.findPostsFor("Pintér Szilveszter");

        // Then
        assertEquals(2, posts.size());
        assertEquals("Javából", posts.get(1).getTitle());
        assertEquals("Vizsgázni Java programozásból", posts.get(1).getContent());
    }


}