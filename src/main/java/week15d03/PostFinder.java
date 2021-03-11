package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }


    public List<Post> findPostsFor(String user) {
        if (posts.isEmpty()) {
            throw new IllegalStateException("Post is empty!");
        }

        List<Post> result = new ArrayList<>();
        for (Post p: posts) {
            if (user.equals(p.getOwner()) && LocalDate.now().isAfter(p.getPublishedAt()) && isValid(p.getContent()) && isValid(p.getTitle())) {
                result.add(p);
            }
        }
        return result;
    }


    public List<Post> getPosts() {
        return new ArrayList<>(posts);
    }


    private boolean isValid(String s) {
        return s != null && !s.isBlank();
    }
}
