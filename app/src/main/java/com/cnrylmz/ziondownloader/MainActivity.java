package com.cnrylmz.ziondownloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cnrylmz.zionfiledownloader.DownloadFile;
import com.cnrylmz.zionfiledownloader.FILE_TYPE;
import com.cnrylmz.zionfiledownloader.ZionDownloadFactory;
import com.cnrylmz.zionfiledownloader.ZionDownloadListener;

public class MainActivity extends AppCompatActivity {

    private static final String pdfUrl = "http://che.org.il/wp-content/uploads/2016/12/pdf-sample.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZionDownloadFactory factory = new ZionDownloadFactory(this, pdfUrl, "fileName");
        DownloadFile downloadFile = factory.downloadFile(FILE_TYPE.PDF);
        downloadFile.start(new ZionDownloadListener() {
            @Override
            public void OnSuccess(String dataPath) {
                // the file saved in your device..
                //dataPath--> android/{your app package}/files/Download
            }

            @Override
            public void OnFailed(String message) {

            }

            @Override
            public void OnPaused(String message) {

            }

            @Override
            public void OnPending(String message) {

            }

            @Override
            public void OnBusy() {

            }
        });


    }
}
