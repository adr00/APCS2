package Febuary.Assignment3;/*
The tests that failed were:
Test: Constructor and toString
	Incorrect: ID #
Test: Invalid Grade
	Incorrect: ID #
   */

public class Student extends Person {

	private int studentId;
	private static int count;
	private int level;
	
	public Student(String fName, String lName, int gLevel) {
		super(fName, lName);
		if (gLevel >= 0 && gLevel <= 12)
			level = gLevel;
		else
			level = 0;
		count++;
		studentId = count;
	}
	
	public int getLevel() {
		return level;
	}
	
   public int getID() {
		return studentId;
	}

	public String toString() {
      String s =  super.toString() +"\n"+"   Grade level: " + getLevel() + "\n" +"   ID: " + studentId;
   	return s;
	}

}