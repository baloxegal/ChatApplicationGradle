package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

//import lib.Message;

public class ChatApplicationServer {
	
	public static final Integer PORT = 7777;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ServerSocket serverSocket = new ServerSocket(PORT);
		
		Socket clientSocket = serverSocket.accept();
		
		ObjectInputStream din = new ObjectInputStream(clientSocket.getInputStream());
		
//		Message message = (Message) din.readObject();		
//		System.out.println("Client sends: " + message.getBody());
		
		System.out.println("Client sends: " + din.readObject());
		
		din.close();
		serverSocket.close();		
	}

}
