package catalog;

public class SearchCriteria {

    private final String contributor;
    private final String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasContributor() {
        return !(contributor == null || contributor.isBlank());
    }

    public boolean hasTitle() {
        return !(title == null || title.isBlank());
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        return new SearchCriteria(contributor, null);
    }

    public static SearchCriteria createByTitle(String title) {
        return new SearchCriteria(null, title);
    }

}
