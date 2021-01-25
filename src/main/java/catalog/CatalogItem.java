package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private List<Feature> features;
    private final int price;
    private final String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = Arrays.asList(features);
    }


    public int fullLengthAtOneItem() {
        int fullLength = 0;
        if (!hasAudioFeature()) {
            return fullLength;
        }

        for (Feature f: features) {
            if (f instanceof AudioFeatures) {
                fullLength += ((AudioFeatures) f).getLength();
            }
        }
        return fullLength;
    }


    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature f: features) {
            contributors.addAll(f.getContributors());
        }
        return contributors;
    }


    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature f: features) {
            titles.add(f.getTitle());
        }
        return titles;
    }


    public boolean hasAudioFeature() {
        for (Feature f: features) {
            if (f instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }


    public boolean hasPrintedFeature() {
        for (Feature f: features) {
            if (f instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }


    public int numberOfPagesAtOneItem() {
        int numberOfPages = 0;
        if (!hasPrintedFeature()) {
            return numberOfPages;
        }

        for (Feature f: features) {
            if (f instanceof PrintedFeatures) {
                numberOfPages += ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return numberOfPages;
    }


    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
