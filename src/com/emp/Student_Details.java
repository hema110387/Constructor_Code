package com.emp;

	 public class Student_Details 
	 { 
	// Declaration of constructor. 
	   Student_Details()
	   {  
	     String nCollege = "PIET"; // Declaration and initialization of local variable. 
	     System.out.println("Name of college: " +nCollege); // We can access local variable inside the constructor. 
	    } 
	// Declaration of instance method. 
	  void subMarks()
	  {
	// Declaration and initialization of local variables. 
	   int cMarks = 90; 
	   int pMarks = 85; 
	   int mMarks = 99; 
	   int totalMarks = cMarks + pMarks + mMarks; 
	   System.out.println("Total marks in PCM: " +totalMarks); 
	  } 
	public static void main(String[] args) 
	{ 
	// Create an object of class. 
	     Student_Details s = new Student_Details(); 
	// System.out.println("Name of college: " +nCollege); // Compile-time error because local variable cannot be accessed from the outside.
	 
	     s.subMarks(); // Calling instance method. 
	 // System.out.println("Total marks in PCM: " + totalMarks); // Compile-time error. 
	   } 
	}

