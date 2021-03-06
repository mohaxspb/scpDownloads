package ru.kuchanov.scpdownloads;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ru.kuchanov.scp.downloads.DialogUtils;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    DialogUtils mDialogUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDialogUtils = new DownloadDialogImpl(null, null, null, new MyConstantValues());

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(v -> {
            Timber.d("Download service start");
//            mDialogUtils.showDownloadDialog(this);
            mDialogUtils.showRangeDialog(this, null, 100, 10, false);
        });
    }
}