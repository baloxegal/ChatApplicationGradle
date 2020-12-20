package server;

import lib.Connection;
import lib.Message;
import lib.Action;
import lib.Operation;
import lib.User;

import java.io.IOException;

public class ChatApplicationServer {
	
	public static final Integer PORT = 7777;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Connection conn = new Connection(PORT);		
		
		conn.fetch();
		conn.send(new Action(Operation.SEND_MSG, new Message("Hello Back!", new User("Mister Egor"), new User("Mister Alesha"))));
		conn.fetch();				
		conn.send(new Action(Operation.CONFITMED));
	}
}
