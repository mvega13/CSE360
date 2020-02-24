package Assign2;

public class SimpleList 
{
	int array[] = new int[10];
	int count  = 0;
	 public SimpleList() 
	  {
		 //hello
	  }
	 /*
	   * Add the parameter to the list at the beginning (index = 0). Move all the
	   * other integers in the list over so there is room. If the list was full, then
	   * the last element falls off the list. Increment the count as needed.
	 */
	 
	  void add(int addIn) 
	  {
	    if (array[9] != 0)
	    	array[9] = 0;
	    else
	    	count++;
	    
	    for (int move = 9; move > 0; move--)
	      array[move] = array[move - 1];
	    
	    array[0] = addIn;
	  }
	  
	  /*
	   * If the parameter is in the list, then remove it. The other values in the list
	   * may need to be moved down. Adjust the count as needed.
	   */
	  void remove(int remove) 
	  {
	    boolean flag = false;
	    for (int checker = 0; checker < 10 && flag == false; checker++)	    
	    {
	      if (array[checker] == remove)
	      {
	        flag = true;
	        for (int mover = checker; (mover + 1) < 10; mover++)
	        {
	        	array[mover] = array[mover + 1];
	        }
	        array[9] = 0; 
	        count--;
	      }
	    }
	  }
	  
	  
	  /*
	   * Return the number of elements stored in the list.
	   */
	  int count() 
	  {
	    return count;
	  }

	  /*
	   * Return the list as a String.  The elements must be separated by a space.  
	   * This means there is not space after the last integer.
	   */
	  
	  public String toString() 
	  {
	    String output = "";
	    if(array[0] != 0)
	    {
	    	output += array[0];
	    	for (int printer = 1; printer < 10 && array[printer] != 0; printer++) 
	  	      output += " " + array[printer];
	    }
	    return output;
	  }

	  
	  /*
	   * Return the location of the parameter in the list.  
	   * If the parameter is not in the list, then return -1. 
	   */
	  
	  int search(int find) 
	  {
	    int count = 0;// the found count is 0 at start
	    for (int finder = 0; finder < 10; finder++)
	    {
	      if (array[finder] == find)
	    	  count++;
	    }
	    
	    if(count == 0)
	    	count = -1;
	    return count;
	  }
	  
	  
	 
}

