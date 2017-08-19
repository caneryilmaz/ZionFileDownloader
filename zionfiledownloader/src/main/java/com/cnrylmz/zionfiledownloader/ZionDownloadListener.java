package com.cnrylmz.zionfiledownloader;

/**
 * Created by caner on 18.08.2017.
 */

public interface ZionDownloadListener {

    void OnSuccess(String dataPath);

    void OnFailed(String message);

    void OnPaused(String message);

    void OnPending(String message);

    void OnBusy();
}
