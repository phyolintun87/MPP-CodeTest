package codetest.april2017.prob2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	//implement
	public void addMessage(String message) {
			queue.enqueue(message);
	}
	
	public String nextMessage() {
		try {
			return queue.peek();
		}catch(EmptyQueueException e){
		
			return "";
		}
	}
	
	public abstract String getName();
}
