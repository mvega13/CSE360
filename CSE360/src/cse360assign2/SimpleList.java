package cse360assign2;

public class SimpleList 
{
	int array[] = new int[10];
	int count  = 0;
	 public SimpleList()
	  {
		 
	  }
	 /*
	 * Add the parameter to the list at the beginning (index = 0). Move all the
	 * other integers in the list over so there is room. If the list was full, then
	 * the last element falls off the list. Increment the count as needed.
	 */
	 
	  void add(int addIn) 
	  {
		
	    if (count == array.length)
	    {
	    	int increBypercent = (int) (( array.length * 0.5) + array.length);
	    	int newArray[] = new int[increBypercent];
	    	for(int copyPos  = 0; copyPos < array.length; copyPos++)
	    		newArray[copyPos] = array[copyPos];
	    	array = newArray;
	    	count++;
	    }
	    else
	    	count++;
	    
	    for (int move = array.length - 1; move > 0; move--)
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
	    for (int checker = 0; checker < array.length && flag == false; checker++)	    
	    {
	      if (array[checker] == remove)
	      {
	        flag = true;
	        for (int mover = checker; (mover + 1) < array.length; mover++)
	        	array[mover] = array[mover + 1];
	        array[array.length-1] = 0; 
	        count--;
	        
	        if((count) < array.length - (array.length * 0.25))
	        {
	        	int decreBypercent = (int) (array.length - (array.length * 0.25));
		    	int newArray[] = new int[decreBypercent];
		    	
	        	for(int copyPos  = 0; copyPos < count; copyPos++)
		    		newArray[copyPos] = array[copyPos];
	        	array = newArray;
	        }
	        
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
	    	for (int printer = 1; printer < array.length && array[printer] != 0; printer++) 
	  	      output += " " + array[printer];
	    }
	    else 
	    {
	    	output = "There is nothing in the list \n";
	    }
	    System.out.println(output);
	    return output;
	  }

	  
	  /*
	   * Return the location of the parameter in the list.  
	   * If the parameter is not in the list, then return -1. 
	   */
	  
	  int search(int find) 
	  {
	    int count = 0;// the found count is 0 at start
	    for (int finder = 0; finder < array.length; finder++)
	    {
	      if (array[finder] == find)
	    	  count++;
	    }
	    
	    if(count == 0)
	    	count = -1;
	    return count;
	  }
	  
	  /*
	   * The append method should append the parameter to 
	   * the end of the list.If the list was full, then
	   * increase the size by 50% so there will be room.
	   * Increment the count. 
	   */
	    void append (int appender)
	    {
	      if(count == array.length)//if the count is the same as the array length then there is no free space
	      {
	        int increPercent = (int) ((array.length * 0.5) + array.length);// the number of spaces the new array will have as it adds 50% to the orginal length
	        int newArray[] = new int[increPercent];
	        for(int copyPos = 0; copyPos < array.length; copyPos++)//copies the old array into the new one
	          newArray[copyPos] = array[copyPos];
	        array = newArray;//the old array becomes the original one
	        array[count] = appender;// adds the number to the end of the list
	        count++;
	      }
	      else//if there is free space then the element is just added and count is updated
	      {
	        array[count] = appender;
	        count++;
	      }
	      
	    }

	    /*
	    * Return the first element in the list
	    */
	    int first()
	    {
	      return array[0];
	    }
	    /*
	    * Return the current number of possible locations in
	    * the list
	    */
	    int size()
	    {
	      int freespace = 0;//acts as a count for every free space
	      for(int freepos = 0; freepos < array.length; freepos++)//Loops through the entire array
	      {
	        if(array[freepos] == 0)//Every free space is counted
	          freespace++;
	      }
	      return freespace;
	    }	 
}

