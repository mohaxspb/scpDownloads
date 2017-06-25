package ru.kuchanov.library;

import java.util.List;

import rx.Observable;

/**
 * Created by mohax on 25.06.2017.
 * <p>
 * for ScpDownloads
 */
public interface ApiClientModel {

    Observable<List<ArticleModel>> getMaterialsArticles(String link);

    Observable<List<ArticleModel>> getObjectsArticles(String link);

    Observable<List<ArticleModel>> getMaterialsJokesArticles();

    Observable<List<ArticleModel>> getMaterialsArchiveArticles();
}