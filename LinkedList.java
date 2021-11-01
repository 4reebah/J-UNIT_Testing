package proj;

public class LinkedList {
	
	Node head;
	Node tail;
	
	
	public String toString()
	{
		String s = "";
		Node node = head;
		while (node != null)
		{
			s += node.getData();
			node = node.getNextNode();
		}
		return s;
	}
	
	public Node getHead()
	{
		return head; 
	}
	
	public Node getTail()
	{
		return tail; 
	}
	
	public Node findNodeWithData(int data)
	{
		Node n = head; 
		while (n != null)
		{
			if (n.getData() == data)
			{
				return n; 
			}
			n = n.getNextNode(); 
		}
		return null; 
	}
	
	public void add(int insert)
	{		
		Node node = new Node(insert);
		if (head == null)
		{
			head = node; 
		}
		
		
		else if (head != null)
		{
			Node n = head; 
			Node current = n; 
			
			while (n != null)
			{
				current = n; 
				n = n.getNextNode(); 
			}
			
			current.setNextNode(node);
			tail = node; 
			
			if (tail == null)
			{
				tail = node; 
			}
		}
	}
	
	
	public void addDataAfterNode(Node insert, int data) throws IllegalArgumentException
	{
		Node add = new Node(data); 
		
		if (insert == null)
		{
			throw new IllegalArgumentException("Node is null"); 
		}
		
		else if (insert == head)
		{
			Node nodeAfterHead = head.getNextNode(); 
			head.setNextNode(add);
			add.setNextNode(nodeAfterHead);
		}
		
		else if (insert == tail)
		{
			tail.setNextNode(add);
			tail = add; 
		}
		
		else
		{
			Node afterAdd = insert.getNextNode(); 
			insert.setNextNode(add);
			add.setNextNode(afterAdd); 	
		}
	}
	
	public static void main (String [] args)
	{
		LinkedList  linkedList = new LinkedList(); 
		
		linkedList.add(11); 
		linkedList.add(12);
		linkedList.add(13);
		
		linkedList.addDataAfterNode(linkedList.getHead(), 0);
		
		System.out.print(linkedList.toString());
	}

	
}
