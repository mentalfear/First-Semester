package KlausurAufgaben1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TwotterSystem {
	
	HashMap<User, List<Message>> map = new HashMap<>();
	
	public void addMessage(User user, Message msg) {
		
		List<Message> temp;
		Set<User> set = map.keySet();
		boolean vorhanden = false;
		
		for(User usr : set) {
			if(usr == user) vorhanden = true;
		}
		
		if(vorhanden) {
			temp = map.get(user);
			map.remove(user);
		}else {
			temp = new ArrayList<>();
		}
		temp.add(msg);
		map.put(user,temp);
		
		
		//map.get(user).add(msg);
	}
	
	public List<Message> getAllMessagesFromUser(User usr) {
		List<Message> temp = map.get(usr);
		return temp;
		
		
	}
	
	public List<Message> getAllMessagesFromDate(String date) {
		List<Message> temp = this.getAllMessages();
		
		temp = temp.stream().filter( msg -> msg.getCreationDate().compareTo(date) == 0)
		.collect(Collectors.toList());
		
		return temp;
		
	}
	
	public List<Message> getAllMessages() {
		List<Message> temp = new ArrayList<Message>();
		Collection<List<Message>> col = map.values();
		
		for(List<Message> msg : col) {
			temp.addAll(msg);
		}
		
		return temp;
		
	}

}
