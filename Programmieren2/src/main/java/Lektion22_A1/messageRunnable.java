package Lektion22_A1;

public class messageRunnable implements Runnable{
	
	String msg;
	
	public messageRunnable(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		System.out.println(msg);
	}

}
