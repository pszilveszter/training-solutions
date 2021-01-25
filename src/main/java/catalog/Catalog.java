package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    
    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item) {
        catalogItems.add(item);
    }


    public void deleteItemByRegistrationNumber(String registrationNumber) {
        for (int i = 0; i < catalogItems.size(); i++) {
            if (registrationNumber.equals(catalogItems.get(i).getRegistrationNumber())) {
                catalogItems.remove(i);
                i--;
            }
        }
    }


    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioItems = new ArrayList<>();
        for (CatalogItem item: catalogItems) {
            if (item.hasAudioFeature()) {
                audioItems.add(item);
            }
        }
        return audioItems;
    }


    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedItems = new ArrayList<>();
        for (CatalogItem item: catalogItems) {
            if (item.hasPrintedFeature()) {
                printedItems.add(item);
            }
        }
        return printedItems;
    }


    public int getAllPageNumber() {
        int totalPages = 0;
        for (CatalogItem item: getPrintedLibraryItems()) {
            totalPages += item.numberOfPagesAtOneItem();
        }
        return totalPages;
    }


    public int getFullLength() {
        int fullLength = 0;
        for (CatalogItem item: getAudioLibraryItems()) {
            fullLength += item.fullLengthAtOneItem();
        }
        return fullLength;
    }


    public double averagePageNumberOver(int limit) {
        if (limit > 0) {
            int sum = 0;
            int count = sum;
            for (CatalogItem item: getPrintedLibraryItems()) {
                if (item.numberOfPagesAtOneItem() > limit) {
                    sum += item.numberOfPagesAtOneItem();
                    count++;
                }
            }

            if (sum == 0) {
                throw new IllegalArgumentException("No page");
            }
            return (double)sum / count;
        }
        throw new IllegalArgumentException("Page number must be positive");
    }


    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> items = new ArrayList<>();
        boolean searchByContributor = searchCriteria.hasContributor();
        boolean searchByTitle = searchCriteria.hasTitle();
        for (CatalogItem item: catalogItems) {
            boolean matchByContributor = item.getContributors().contains(searchCriteria.getContributor());
            boolean matchByTitle = item.getTitles().contains(searchCriteria.getTitle());
            if (searchByContributor && searchByTitle && matchByContributor && matchByTitle
                    || searchByContributor && !searchByTitle && matchByContributor
                    || !searchByContributor && searchByTitle && matchByTitle) {
                        items.add(item);
            }
        }
        return items;
    }
}
