package ru.kuchanov.scpdownloads;

import android.util.Pair;

import java.util.List;

import ru.kuchanov.library.ApiClientModel;
import ru.kuchanov.library.ArticleModel;
import ru.kuchanov.library.DbProviderModel;
import ru.kuchanov.library.DownloadAllService;
import ru.kuchanov.library.DownloadEntry;
import rx.Observable;
import timber.log.Timber;

/**
 * Created by mohax on 24.06.2017.
 * <p>
 * for ScpDownloads
 */
public class DownloadAllServiceTest extends DownloadAllService {

    @Override
    protected void download(DownloadEntry type) {

    }

    @Override
    public ApiClientModel getApiClient() {
        return null;
    }

    @Override
    protected int getNumOfArticlesOnRecentPage() {
        return 30;
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

            @Override
            public int getScore() {
                return 0;
            }

            @Override
            public Observable<Pair<Integer, Integer>> saveObjectsArticlesList(List articles, String dbField) {
                return null;
            }
        };
    }
}