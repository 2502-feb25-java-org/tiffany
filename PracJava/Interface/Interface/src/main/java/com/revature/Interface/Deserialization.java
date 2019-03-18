package com.revature.Interface;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialization {

	public static void main(String[] args) throws Exception {

		ArrayList<String> namesList = new ArrayList<String>();
        
		ArrayList<Employee> employees = new ArrayList<>();
        
        try
        {
            FileInputStream fis = new FileInputStream("employees.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            employees = (ArrayList) ois.readObject();
 
            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
         
        //Verify list data
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        

	}

}
