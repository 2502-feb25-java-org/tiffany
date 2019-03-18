package com.revature.Interface;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *  Create a list of employees, serialize it,  and save  the serialize  data to a file. 
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
    	ArrayList<Employee> emp = new ArrayList<>();
    
    	emp.add(new Employee("1","Gregory ","Bowden"));
    	emp.add(new Employee("2","Elisha ","Kellman"));
    	emp.add(new Employee("1","Sophia ","Lee"));
    	emp.add(new Employee("1","Milani ","Sealy"));
        
        try {
			FileOutputStream fos = new FileOutputStream("employees.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
			fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
        
        
    System.out.println("done");
    
    
    }
    
}
 
    		
        
      
        
 
 

