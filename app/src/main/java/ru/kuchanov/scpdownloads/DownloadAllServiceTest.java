package ru.kuchanov.scpdownloads;

import java.util.ArrayList;
import java.util.List;

import ru.kuchanov.library.ArticleModel;
import ru.kuchanov.library.DbProviderModel;
import ru.kuchanov.library.DownloadAllService;
import rx.Observable;
import timber.log.Timber;

/**
 * Created by mohax on 24.06.2017.
 * <p>
 * for ScpDownloads
 */
public class DownloadAllServiceTest extends DownloadAllService {
    @Override
    protected Observable<Integer> getRecentArticlesPageCountObservable() {
        return Observable.just(3);
    }

    @Override
    protected int getNumOfArticlesOnRecentPage() {
        return 30;
    }

    @Override
    protected Observable<List<ArticleModel>> getRecentArticlesForPage(int page) {
        return Observable.unsafeCreate(subscriber -> {
            List<ArticleModel> articleModels = new ArrayList<>();

            subscriber.onNext(articleModels);
            subscriber.onCompleted();
        });
    }

    @Override
    protected DbProviderModel getDbProviderModel() {
        return new DbProviderModel() {
            @Override
            public ArticleModel getUnmanagedArticleSync(String id) {
                return null;
            }

            @Override
            public void saveArticleSync(ArticleModel articleModel, boolean closeDbConnection) {
                Timber.d("saveArticleSync: %s", articleModel.getUrl());
            }

            @Override
            public void close() {
                Timber.d(" close");
            }
        };
    }

    @Override
    protected ArticleModel getArticleFromApi(String id) {
        return new ArticleModel() {
            @Override
            public String getUrl() {
                return "url";
            }

            @Override
            public String getText() {
                return "text";
            }
        };
    }
}