package com.cnrylmz.zionfiledownloader;

import android.content.Context;

/**
 * Created by caner on 18.08.2017.
 */

public final class ZionDownloadFactory {


    private String downloadFileUrl, fileName;
    private Context context;

    public ZionDownloadFactory(Context context, String downloadFileUrl, String fileName) {
        this.context = context;
        this.downloadFileUrl = downloadFileUrl;
        this.fileName = fileName;
    }


    public DownloadFile downloadFile(FILE_TYPE fileType) {
        switch (fileType) {
            case MP3: {
                return new DownloadMp3(context, downloadFileUrl, fileName);
            }
            case IMAGE: {
                return new DownloadImage(context, downloadFileUrl, fileName);
            }
            case VIDEO: {
                return new DownloadVideo(context, downloadFileUrl, fileName);
            }
            case PDF: {
                return new DownloadPdf(context, downloadFileUrl, fileName);
            }
        }


        return null;
    }

}
