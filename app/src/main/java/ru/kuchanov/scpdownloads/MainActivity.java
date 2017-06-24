package ru.kuchanov.scpdownloads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ru.kuchanov.library.DownloadAllService;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(v -> {
            Timber.d("Download service start");
            DownloadAllService.startDownloadWithType(this, DownloadAllService.DownloadType.TYPE_ALL, 0, 40);
        });
    }
}