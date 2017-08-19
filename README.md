# The ZionFactory help you download files with so short code <h1>
![96926-200](https://user-images.githubusercontent.com/7602125/29486992-1d07f78e-84fb-11e7-860c-e29d6c3de0d8.png)![android](https://user-images.githubusercontent.com/7602125/29486990-13ac14ae-84fb-11e7-8c4c-9afd0487dd88.jpg)


### create an instance from  ZionDownloadFactory set fileUrl and fileName parameter <h3>
```java
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
```

## for choosing another type download mode just change FILE_TYPE parameter.. <h2>

```gradle
allprojects {
repositories {
...
maven { url 'https://jitpack.io' }
	}
}
```
```gradle
dependencies {
	 compile 'com.github.caneryilmaz:ZionFileDownloader:0.1.1'
	}
  ```
