package KlausurAufgaben1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<User> userArr = new ArrayList<>();
		userArr.add(new User("Hans","1234"));
		userArr.add(new User("Georg","1234"));
		userArr.add(new User("Arm","1234"));
		
		UserManager manager = new UserManager();
		manager.serialize(userArr);
		List<User> deArr = manager.deserialize();
		
		for(User user : deArr) {
			System.out.println(user.getName());
		}
		
		TwotterSystem sys = new TwotterSystem();
		User u = new User("peter","1234");
		User u2 = new User("Adolf","1234");
		sys.addMessage(u, new Message("Hello World1","2018-01-31"));
		sys.addMessage(u, new Message("Hello World2","2018-01-31"));
		sys.addMessage(u, new Message("Hello World3","2018-01-30"));
		sys.addMessage(u2, new Message("Hellosss World","2018-02-31"));
		
		
		List<Message> a = sys.getAllMessages();
		List<Message> d = sys.getAllMessagesFromUser(u2);
		List<Message> m = sys.getAllMessagesFromDate("2018-01-31");
		
		for(Message msg : m) {
			System.out.println(msg.getMessage());
		}
		
		//DownloadManager dmang = new DownloadManager.DownloadManagerBuilder().setMaxThreads(2).setTimeout(1000).specifyDownloadLacation("google.de").build();
		
	}

}
