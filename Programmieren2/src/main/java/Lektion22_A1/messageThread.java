package Lektion22_A1;

public class messageThread extends Thread{
	
	String msg;
	
	public messageThread(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	@Override
	public void run() {
		System.out.println(msg);
	}

}
