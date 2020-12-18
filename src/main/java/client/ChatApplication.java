package client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import lib.Message;

public class ChatApplication {

	public static void main(String[] args) throws IOException {		
		
		Message message = new Message("Hello Server!");
		
		Socket clientSocket = new Socket(InetAddress.getLoopbackAddress(), server.ChatApplication.PORT);
		
		ObjectOutputStream dout = new ObjectOutputStream(clientSocket.getOutputStream());
		
		dout.writeObject(message);
		
		dout.flush();
		dout.close();

	}

}
