package tools;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logger {
	
	@Before("call(client.ChatApplication.main(..))")
	private void LogBeforStartClient() {
		
		System.out.println("Chat Starting");
		
	}
	
	@After("call(client.ChatApplication.main(..))")
	private void LogAfterStartClient() {
		
		System.out.println("Chat Ending");
		
	}
	
}
