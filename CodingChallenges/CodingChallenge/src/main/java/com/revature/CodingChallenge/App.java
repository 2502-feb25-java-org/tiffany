package com.revature.CodingChallenge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


/**
 * Write a program that stores the following strings 
 * in an ArrayList and saves all the palindromes (the same word reversed) in another ArrayList.

"karan", "madam", "tom", "civic", "radar", 
"sexes", "jimmy", "kayak", "john", "refer", "billy", "did"
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	
    	//make the array list  
    	ArrayList<String> names = new ArrayList<String>(
    	Arrays.asList("karan", "madam", "tom", "civic", "radar", 
"sexes", "jimmy", "kayak", "john", "refer", "billy", "did")
    			);
    	//write it
    	try(BufferedWriter out = new BufferedWriter(new FileWriter("src/palindromes.ser")))
    	{
    		Iterator<String> iter = names.iterator();
    		
    		while ( iter.hasNext())
    			out.write("-" +iter.next() + "-," );
    	}catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	System.out.println("ArrayList: " + names);
    	
    	//
    	System.out.println("ArrayList palidromes: " + palindromes(names));
    	System.out.println("done");
    }
private static ArrayList<String> pal = new ArrayList<String>();
	
	
	private static ArrayList<String> palindromes( ArrayList<String> list )
	{
		// this should compare and count the string length for if it %2 == 0  , 
		// then reverses the the first letters
		int comparsions,
		    counter;
		
		// loop for checking palidromes 
		for(String s: list)
		{
			if( s.length() % 2 == 0 )
			{
				comparsions = s.length() / 2;
				counter = 0;
				
				for(int i = 0; i < comparsions; i++)
				{		
					if( s.charAt(i) == s.charAt( s.length() - i - 1) )
						counter++;
					
					if( counter == comparsions )
						pal.add(s);
				}
			}
			
			// if it's a polidrome add to list?
			else 
			{
				comparsions = (s.length()- 1) / 2;
				counter = 0;
				
				for(int j = 0; j < comparsions; j++)
				{	
					if( s.charAt(j) ==  s.charAt( s.length() - j - 1)  )
						counter++;
					
					if( counter == comparsions )
						pal.add(s);	
				}
			}
			
			
		}
		return pal;
	}
}
