package ru.kuchanov.scpdownloads;

import android.app.Application;
import android.util.Log;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import timber.log.Timber;

/**
 * Created by mohax on 01.01.2017.
 * <p>
 * for scp_ru
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        Log.d(MyApplication.class.getSimpleName(), "onCreate");
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree() {
                @Override
                protected void log(int priority, String tag, String message, Throwable t) {
                    message = formatLogs(message);
                    super.log(priority, tag, message, t);
                }

                private String formatLogs(String message) {
                    if (!message.startsWith("{")) {
                        return message;
                    }
                    try {
                        return new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(message));
                    } catch (JsonSyntaxException m) {
                        return message;
                    }
                }
            });
        } else {
            Timber.plant(new Timber.DebugTree() {
                @Override
                protected void log(int priority, String tag, String message, Throwable t) {
                    if (priority == Log.ERROR) {
                        //maybe send error via some service, i.e. firebase or googleAnalitics
                        super.log(priority, tag, message, t);
                    }
                }
            });
        }
    }
}