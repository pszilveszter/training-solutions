package catalog;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private final List<String> composer;
    private final int length;
    private final List<String> performers;
    private final String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        this(title, length, performers, new ArrayList<>());
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (length < 1 || isEmpty(performers)) {
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>(composer);
        result.addAll(performers);
        return result;
    }
}
