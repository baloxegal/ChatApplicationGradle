package client;

import lib.Connection;
import lib.Message;
import lib.Action;
import lib.Operation;
import lib.User;
import java.net.InetAddress;
import java.io.IOException;

public class ChatApplicationClient {
	public static final Integer PORT = 7777;
	public static final InetAddress HOST = InetAddress.getLoopbackAddress();

	public static void main(String[] args) throws IOException, ClassNotFoundException {		
		
		Connection conn = new Connection(HOST, PORT);
		
		
		conn.send(new Action(Operation.SEND_MSG, new Message("Hello Server!", new User("Mister Alesha"), new User("Mister Egor"))));
		conn.fetch();
		conn.send(new Action(Operation.CONFIRM));
		conn.fetch();
		
	}
}
