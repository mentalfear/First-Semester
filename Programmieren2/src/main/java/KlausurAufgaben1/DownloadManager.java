package KlausurAufgaben1;

import java.net.URL;

public class DownloadManager {
	
	int maxThreads;
	long timeout;
	URL url;
	
	private DownloadManager(int maxThreads, long timeout, URL url) {
		this.maxThreads = maxThreads;
		this.timeout = timeout;
		this.url = url;
	}
	
	public String startDownload() {
		DownloadJob dj = new DownloadJob(url);
		dj.start();
		
		return dj.getJobID();
	}
	
	public static class DownloadManagerBuilder {
		int maxThreads = 1;
		long timeout = 1000;
		URL url = null;
			
		public DownloadManagerBuilder specifyDownloadLacation(URL url) {
			this.url = url;
			return this;
		}
		
		public DownloadManagerBuilder setMaxThreads(int t) {
			this.maxThreads = t;
			return this;
		}
		
		public DownloadManagerBuilder setTimeout(int out) {
			this.timeout = out;
			return this;
		}
		
		public DownloadManager build() {
			return new DownloadManager(maxThreads, timeout, url);
		}

		
	}

}
