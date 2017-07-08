package ru.kuchanov.scpdownloads;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import ru.kuchanov.scp.downloads.ApiClientModel;
import ru.kuchanov.scp.downloads.DbProviderFactoryModel;
import ru.kuchanov.scp.downloads.DialogUtils;
import ru.kuchanov.scp.downloads.DownloadEntry;
import ru.kuchanov.scp.downloads.MyPreferenceManagerModel;
import timber.log.Timber;

/**
 * Created by mohax on 27.06.2017.
 * <p>
 * for ScpDownloads
 */
public class DownloadDialogImpl extends DialogUtils {

    public DownloadDialogImpl(
            MyPreferenceManagerModel preferenceManager,
            DbProviderFactoryModel dbProviderFactory,
            ApiClientModel apiClient) {
        super(preferenceManager, dbProviderFactory, apiClient, DownloadAllServiceTest.class);
    }

    @Override
    public List<DownloadEntry> getDownloadTypesEntries(Context context) {
        List<DownloadEntry> downloadEntries = new ArrayList<>();
        downloadEntries.add(new DownloadEntry(R.string.type_1, context.getString(R.string.type_1), "test", "test"));
        return downloadEntries;
    }

    @Override
    protected boolean isServiceRunning() {
        //TODO
        return false;
    }

    @Override
    protected void onIncreaseLimitClick(Context context) {

    }

    @Override
    protected void logDownloadAttempt(DownloadEntry type) {
        Timber.d("logDownloadAttempt: %s", type);
    }
}