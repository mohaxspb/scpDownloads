package ru.kuchanov.scp.downloads;

/**
 * Created by mohax on 25.06.2017.
 * <p>
 * for ScpDownloads
 */
public interface MyPreferenceManagerModel {

    boolean isNightMode();

    boolean isHasSubscription();

    boolean isDownloadAllEnabledForFree();

    int getScorePerArt();

    int getFreeOfflineLimit();
}