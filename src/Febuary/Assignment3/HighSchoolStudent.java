package Febuary.Assignment3;

public class HighSchoolStudent extends Student{

	private double gpa;
	
	public HighSchoolStudent(String fName, String lName, int gLevel, double GPA) {
		super(fName, lName, gLevel);
		if (GPA >= 0 && GPA <= 5)
			gpa = GPA;
		else
			gpa = 0;
	}
	
	public String toString() {
		String s = "" + super.toString() + "\n \t GPA: " + gpa;
		return s;
	}
	

}