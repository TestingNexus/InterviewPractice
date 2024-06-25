package pageInitializer;

import pages.PracticeSitePage;

public class PageInitializer {
    public static PracticeSitePage practiceSitePage;

    public static void initializeAllPages() {
        practiceSitePage = new PracticeSitePage();
    }
}
