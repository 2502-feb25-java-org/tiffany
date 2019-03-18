package com.revature.JDBCprac;


public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) //we're taking the brain and body because they're a given
    {
        super(name, 1, 1, size, weight); // so just say how many they have.
        // then initialie it.
        this.tail= tail;
        this.teeth = teeth;
        this.eyes = eyes;
        this.legs = legs;
        this.coat = coat;

    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat()
    {
            System.out.println("Dog.eat() called");
            chew();
            super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run() called"); 
        move(15);
    }
    }


    
