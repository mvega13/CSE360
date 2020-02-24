package Assign2;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class Assign2_Test {
	@Test
	  public void test1()//Tests the add function and toString
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
	public void test2()//Tests the add function more
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
	    
	    String compare = "245 364 1 2 3 4 5 6 7 8";
	    assertTrue(compare.compareTo(theList.toString())==0);
	}
	
	@Test
	public void test3()//Tests the remove function 
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
	public void test3fail()//Tests the remove function 
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
	public void test4()//Tests the count function
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
	public void test4fail()//Tests the count function
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
	public void test5()//Tests search function
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
	public void test6()//Tests the failure of search
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

}
