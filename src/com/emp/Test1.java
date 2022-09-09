package com.emp;

public class Test1 {
	// Declaration of static variables. 
	    static int a = 400; 
	    static int b = 500; 
	// Static method or main method. 
	    public static void main(String[] args)
	    { 
	// Static area. So, we can call static variables or static methods by using the class name. 
	     System.out.println(Test1.a); // Test is the name of class. 
	     System.out.println(Test1.b); 
	      Test1 t = new Test1(); // Creating the object of class Test. 
	       t.m1(); 
	    } 
	// Instance method. 
	    void m1()
	    { 
	// Instance area. 
	     System.out.println(Test1.a); 
	     System.out.println(Test1.b); 
	    } 
	}

