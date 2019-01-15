package DataStructure;

public class LinkedListNode<T> {
	private T data;
	private LinkedListNode<T> next;
	
	public LinkedListNode() {
		
	}
	
	public LinkedListNode(T data) {
		this.data = data;
	}
	
	public LinkedListNode(T data, LinkedListNode<T> next) {
		this.data = data;
		this.next = next;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}
	
	public String toString() {
		return (String)data;
	}
}
