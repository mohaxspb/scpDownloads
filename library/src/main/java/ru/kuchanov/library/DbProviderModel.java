package ru.kuchanov.library;

/**
 * Created by mohax on 24.06.2017.
 * <p>
 * for ScpDownloads
 */
public interface DbProviderModel {

    ArticleModel getUnmanagedArticleSync(String id);

    void saveArticleSync(ArticleModel articleModel, boolean closeDbConnection);

    void close();

    int getScore();
}