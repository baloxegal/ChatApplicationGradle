package lib;

import java.io.Serializable;

public class Message implements Serializable {
	
	private static final long serialVersionUID = -558858679759501888L;
	private String body;

	public Message(String body) {
		super();
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Message [body=" + body + "]";
	}	
}
