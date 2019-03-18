package com.revature.JDBCprac;

public class CarMain {

    public static void main(String[] args) {
       Car porsche = new Car(); // define the object based on the template (class)
       Car  honda = new Car();
     
       //access the feilds
       porsche.setModel("Carrera"); 

       System.out.println("Model is " +porsche.getModel());
    }
}