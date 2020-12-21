package lib;

public class Action {
	
	private Operation type;
	private Object target;

	public Action() {
		
	}
	
	public Action(Operation type) {
		this.type = type;
	}
	
	public Action(Operation type, Object target) {
		this.type = type;
		this.target = target;
	}

	public Operation getOperation() {
		return type;
	}

	public void setOperation(Operation type) {
		this.type = type;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Action [operation=" + type + ", target=" + target + "]";
	}	
}
