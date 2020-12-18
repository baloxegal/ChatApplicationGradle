package tools;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logger {
	
	@Before("execution(* client.ChatApplicationClient.main(..))")
	public void LogBeforStartClient() {
		
		System.out.println("Client Starting");
		
	}
	
	@Before("execution(* server.ChatApplicationServer.main(..))")
	public void LogBeforStartServer() {
		
		System.out.println("Server Starting");
		
	}
	
	@After("execution(* client.ChatApplicationClient.main(..))")
	public void LogAfterEndClient() {
		
		System.out.println("Client Ending");
		
	}	
	
	@After("execution(* server.ChatApplicationServer.main(..))")
	public void LogAfterEndServer() {
		
		System.out.println("Client Ending");
		
	}
	
}
