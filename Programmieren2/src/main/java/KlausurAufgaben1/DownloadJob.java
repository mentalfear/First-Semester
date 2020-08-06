package KlausurAufgaben1;

import java.net.URL;
import java.util.UUID;

public class DownloadJob extends Thread{

	byte[] datei;
	URL url;
	String jobId;
	
	public DownloadJob(URL url) {
		this.url = url;
		this.jobId = UUID.randomUUID().toString(); 
	}
	
	public String getJobID() {
		return jobId;
	}
	
	public byte[] getDatei() {
		return datei;
	}
	
	@Override
	public void run() {
		// configure den Download manager
		//datei = downloadFromURL(url);
	}
	
}
