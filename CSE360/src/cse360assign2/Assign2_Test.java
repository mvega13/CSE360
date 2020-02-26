package cse360assign2;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class Assign2_Test {
	/*
	@Test
	  public void testAdd()//Tests the add function and toString
	  {
		
	    SimpleList theList = new SimpleList();
	    theList.add(10);
	    theList.add(9);
	    theList.add(8);
	    theList.add(7);
	    theList.add(6);
	    theList.add(5);
	    theList.add(4);
	    theList.add(3);
	    theList.add(2);
	    theList.add(1);
	    
	    
	    String compare = "1 2 3 4 5 6 7 8 9 10";
	    assertTrue(compare.compareTo(theList.toString())==0);
	  }
	@Test
	public void testAddMore()//Tests the add function more
	{
		SimpleList theList = new SimpleList();
	    theList.add(10);
	    theList.add(9);
	    theList.add(8);
	    theList.add(7);
	    theList.add(6);
	    theList.add(5);
	    theList.add(4);
	    theList.add(3);
	    theList.add(2);
	    theList.add(1);
	    theList.toString();
	    
	    theList.add(364);
	    theList.add(245);
	    
	    String compare = "245 364 1 2 3 4 5 6 7 8 9 10";
	    assertTrue(compare.compareTo(theList.toString())==0);
	}
	
	@Test
	public void testRemove()//Tests the remove function 
	{
		SimpleList theList = new SimpleList();
	    theList.add(10);
	    theList.add(9);
	    theList.add(8);
	    theList.add(7);
	    theList.add(6);
	    theList.add(5);
	    theList.add(4);
	    theList.add(3);
	    theList.add(2);
	    theList.add(1);
	    theList.toString();
	    
	    theList.remove(10);
	    theList.remove(5);
	    
	    String compare = "1 2 3 4 6 7 8 9";
	    assertTrue(compare.compareTo(theList.toString())==0);
	}
	@Test
	public void testRemoveMove()//Tests the remove function 
	{
		SimpleList theList = new SimpleList();
	    theList.add(10);
	    theList.add(9);
	    theList.add(8);
	    theList.add(7);
	    theList.add(6);
	    theList.add(5);
	    theList.add(4);
	    theList.add(3);
	    theList.add(2);
	    theList.add(1);
	    theList.toString();
	    
	    theList.remove(10);
	    theList.remove(5);
	    theList.remove(3);
	    theList.remove(7);
	    theList.remove(1);
	    
	    String compare = "2 4 6 8 9";
	    assertTrue(compare.compareTo(theList.toString())==0);
	}
	@Test
	public void testRemoveFail()//Tests the remove function 
	{
		SimpleList theList = new SimpleList();
	    theList.add(10);
	    theList.add(9);
	    theList.add(8);
	    theList.add(7);
	    theList.add(6);
	    theList.add(5);
	    theList.add(4);
	    theList.add(3);
	    theList.add(2);
	    theList.add(1);
	    theList.toString();
	    
	    theList.remove(67);
	    theList.remove(89);
	    
	    String compare = "1 2 3 4 5 6 7 8 9 10";
	    assertTrue(compare.compareTo(theList.toString())==0);
	}
	@Test
	public void testCount()//Tests the count function
	{
		SimpleList theList = new SimpleList();
	    theList.add(1);
	    theList.add(2);
	    theList.add(3);
	    theList.add(4);
	    theList.add(5);
	    theList.add(6);
	    theList.add(7);
	    theList.add(8);
	    theList.add(9);
	    theList.add(10);
	    theList.toString();
	    
	    assertTrue(10 == theList.count());
	}
	@Test
	public void testCountFail()//Tests the count function
	{
		SimpleList theList = new SimpleList();
	    theList.add(1);
	    theList.add(2);
	    theList.add(3);
	    theList.add(4);
	    theList.add(5);
	    theList.add(6);
	    theList.add(7);
	    theList.add(8);
	    theList.add(9);
	    theList.add(10);
	    theList.toString();
	    
	    assertTrue(9 != theList.count());
	}
	@Test
	public void testSearch()//Tests search function
	{
		SimpleList theList = new SimpleList();
	    theList.add(1);
	    theList.add(2);
	    theList.add(3);
	    theList.add(4);
	    theList.add(2);
	    theList.add(6);
	    theList.add(7);
	    theList.add(2);
	    theList.add(9);
	    theList.add(2);
	    theList.toString();
	    
	    assertTrue(4 == theList.search(2));
	}
	
	@Test
	public void testFailSearch()//Tests the failure of search
	{
		SimpleList theList = new SimpleList();
	    theList.add(1);
	    theList.add(2);
	    theList.add(3);
	    theList.add(4);
	    theList.add(2);
	    theList.add(6);
	    theList.add(7);
	    theList.add(2);
	    theList.add(9);
	    theList.add(2);
	    theList.toString();
	    
	    assertTrue(-1 == theList.search(10));
	}
	@Test
	public void testFirst()
	{
		SimpleList theList = new SimpleList();
	    theList.add(1);
	    theList.add(2);
	    theList.add(3);
	    theList.add(4);
	    theList.add(5);
	    theList.toString();
	    
	    assertTrue(5 == theList.first());
	}
	@Test
	public void testSize()
	{
		SimpleList theList = new SimpleList();
	    theList.add(1);
	    theList.add(2);
	    theList.add(3);
	    theList.add(4);
	    theList.add(5);

	    theList.toString();
	    
	    assertTrue(5 == theList.size());
	}
	*/
	@Test
	public void testAppend()//Tests the failure of search
	{
		SimpleList theList = new SimpleList();
	    theList.add(2);
	    theList.add(3);
	    theList.add(4);
	    theList.add(2);
	    theList.add(6);
	    theList.add(2);
	    theList.add(9);
	    theList.add(2);
	    theList.append(7);
	    theList.toString();
	    
	    String output = "2 9 2 6 2 4 3 2 7";
	    assertTrue(output.compareTo(theList.toString())==0);
	}
	@Test
	public void testAppendMore()//Tests the failure of search
	{
		SimpleList theList = new SimpleList();
		theList.add(10);
	    theList.add(1);
	    theList.add(2);
	    theList.add(3);
	    theList.add(4);
	    theList.add(2);
	    theList.add(6);
	    theList.add(7);
	    theList.add(2);
	    theList.add(9);
	    theList.toString();
	    System.out.println(theList.count());
	    theList.append(5);
	    
	    
	    String output = "9 2 7 6 2 4 3 2 1 10 5";
	    assertTrue(output.compareTo(theList.toString())==0);
	}

}
