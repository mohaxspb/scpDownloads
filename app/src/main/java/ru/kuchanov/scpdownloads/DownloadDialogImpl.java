package ru.kuchanov.scpdownloads;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import ru.kuchanov.library.ApiClientModel;
import ru.kuchanov.library.DbProviderFactoryModel;
import ru.kuchanov.library.DialogUtils;
import ru.kuchanov.library.DownloadEntry;
import ru.kuchanov.library.MyPreferenceManagerModel;
import timber.log.Timber;

/**
 * Created by mohax on 27.06.2017.
 * <p>
 * for ScpDownloads
 */
public class DownloadDialogImpl extends DialogUtils {

    public DownloadDialogImpl(MyPreferenceManagerModel preferenceManager, DbProviderFactoryModel dbProviderFactory, ApiClientModel apiClient) {
        super(preferenceManager, dbProviderFactory, apiClient);
    }

    @Override
    public List<DownloadEntry> getDownloadTypesEntries(Context context) {
        List<DownloadEntry> downloadEntries = new ArrayList<>();
//        downloadEntries.add(new DownloadEntry(R.str))
        //TODO
        return null;
    }

    @Override
    protected boolean isServiceRunning() {
        //TODO
        return false;
    }

    @Override
    protected void onIncreaseLimitClick() {
        Timber.d("onIncreaseLimitClick");
    }

    @Override
    protected void logDownloadAttempt(DownloadEntry type) {
        Timber.d("logDownloadAttempt: %s", type);
    }
}