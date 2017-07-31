package ru.kuchanov.scp.downloads;

/**
 * Created by mohax on 15.07.2017.
 * <p>
 * for ScpFoundationRu
 */
public interface ConstantValues {

    String getBaseApiUrl();

    String getMain();

    String getMostRated();

    String getNewArticles();

    String getObjects1();

    String getObjects2();

    String getObjects3();

    String getObjects4();

    String getObjectsRu();

    String getExperiments();

    String getIncidents();

    String getInterviews();

    String getJokes();

    String getArchive();

    String getOthers();

    String getLeaks();

    String getAbout();

    String getNews();

    String getStories();

    String[] getAllLinksArray();

    String getMostRecentUrl();

    String getMostRatedUrl();

    String getSearchSiteUrl();

    String getRandomPageUrl();

    int getNumOfArticlesOnRecentPage();

    int getNumOfArticlesOnRatedPage();

    int getNumOfArticlesOnSearchPage();
}