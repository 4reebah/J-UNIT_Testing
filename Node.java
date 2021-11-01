package proj;

public class Node {
	
	private int data;
	private Node next;
	
	public Node(int data)
	{
		this.data = data; 
	}
	
	public int getData()
	{
		return data; 
	}
	
	public Node getNextNode()
	{
		return next; 
	}
	
	public void setNextNode(Node data)
	{
		this.next = data; 
	}
	
	
	
}
