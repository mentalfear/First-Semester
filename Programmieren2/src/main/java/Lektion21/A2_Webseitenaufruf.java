package Lektion21;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;

public class A2_Webseitenaufruf {
	
	public static void main(String[] args) {
		
		Client newClient = ClientBuilder.newClient();
		WebTarget target = newClient.target("https://jsonplaceholder.typicode.com/");
		target = target.path("posts/1");
		Response res = target.request(MediaType.APPLICATION_JSON)
				.get();
		
		String s = res.readEntity(String.class);
		System.out.println(s);
		
		
		Response response = ClientBuilder.newClient()
				.target("https://jsonplaceholder.typicode.com/")
				.path("posts/1")
				.request(MediaType.APPLICATION_JSON)
				.get();
		
		s = response.readEntity(String.class);
		System.out.println(s);
		
	}

}
