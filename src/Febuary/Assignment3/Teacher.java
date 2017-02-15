package Febuary.Assignment3;

import Febuary.Assignment3.Person;

public class Teacher extends Person
{

	private String subject;
	
	public Teacher(String fName, String lName, String subj) {
		super(fName, lName);
		subject = subj;
	}
	
	public String toString() {
		String s = "" + super.toString() + "\n \t Subject: " + subject;
		return s;
		
	}

}