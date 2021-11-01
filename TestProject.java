package proj;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestProject{
	
	LinkedList linkedList = new LinkedList();	
	
	
	//Find Node Data Testing 
	
	@Before
	public void before()
	{
		System.out.println("ENTERING TEST CASE...");
	}
	
	@After
	public void afterMiddle()
	{
		System.out.println("...TEST PASSED!");
		System.out.println("***********"); 
		System.out.println(""); 
	}
	
	
	@Test
	public void testFindNodeDataForHead()
	{
		linkedList.add(1); 
		linkedList.add(2);

		assertEquals(linkedList.getHead(), linkedList.findNodeWithData(1)); 
		System.out.println("FOUND NODE AT HEAD"); 
		
	}
	
	@Test
	public void testFindNodeDataForMiddle()
	{
		linkedList.add(4); 
		linkedList.add(6);
		linkedList.add(8);

		assertEquals(linkedList.getHead().getNextNode(), linkedList.findNodeWithData(6)); 
		System.out.println("FOUND NODE AT MIDDLE"); 


	}
	
	@Test
	public void testFindNodeDataForTail()
	{
		linkedList.add(5); 
		linkedList.add(10);

		assertEquals(linkedList.getTail(), linkedList.findNodeWithData(10)); 
		System.out.println("FOUND NODE AT TAIL"); 

	}
	
	@Test
	public void testFindNodeDataForHeadFail()
	{
		linkedList.add(7); 
		linkedList.add(9);

		assertNull(linkedList.findNodeWithData(5)); 
		System.out.println("DID NOT FIND NODE AT HEAD"); 

	}
	
	@Test
	public void testFindNodeDataForTailFail()
	{
		linkedList.add(1); 
		linkedList.add(2);

		assertNull(linkedList.findNodeWithData(5)); 
		System.out.println("DID NOT FIND NODE AT TAIL"); 


	}
	
	@Test
	public void testFindNodeDataForMiddleFail()
	{
		linkedList.add(4); 
		linkedList.add(6);
		linkedList.add(8);

		assertNull(linkedList.findNodeWithData(5)); 
		System.out.println("DID NOT FIND NODE AT MIDDLE"); 

	}
	
	
	
	//Add Data After Node Method Testing 
	
	

	@Test
	public void testAddDataAfterNodeForHead()
	{
		linkedList.add(11); 
		linkedList.add(12);
		linkedList.add(13);

		linkedList.addDataAfterNode(linkedList.getHead(), 0);
		
		assertEquals("1101213", linkedList.toString()); 
		System.out.println("DATA HAS BEEN ADDED TO THE HEAD"); 
	}
	
		
	@Test
	public void testAddDataAfterNodeForMiddle()
	{
		linkedList.add(17); 
		linkedList.add(18);
		linkedList.add(19);

		linkedList.addDataAfterNode(linkedList.getHead().getNextNode(), 0);
		
		assertEquals("1718019", linkedList.toString()); 
		System.out.println("DATA HAS BEEN ADDED TO THE MIDDLE"); 

	}
	
	
	@Test
	public void testAddDataAfterNodeForTail()
	{
		linkedList.add(4); 
		linkedList.add(8);
		linkedList.add(12);

		linkedList.addDataAfterNode(linkedList.getTail(), 16);
		
		assertEquals("481216", linkedList.toString()); 
		System.out.println("DATA HAS BEEN ADDED TO THE TAIL"); 

	}
	
	
	@Test
	public void testAddDataAfterNodeGetException()
	{
		linkedList.add(11); 
		linkedList.add(12);
		linkedList.add(13);
		
		try
		{
			linkedList.addDataAfterNode(null, 10);
		}
		catch (Exception e)
		{
			assertEquals("Node is null", e.getMessage());
			System.out.println("EXCEPTION MESSAGE FOUND"); 

		}
	}

	
}
	
	


