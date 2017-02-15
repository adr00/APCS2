package Febuary.Assignment3;

import java.util.ArrayList;


public class School {

	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	
	public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
		this.students = students;
		this.teachers = teachers;
	}
	
	public String getGradeLevel(int level) {
		String r = "";
		for (Student s: students)
		{
			if (s.getLevel() == level)
				r = r + s.toString() + "\n";
		}
		return r;
	}
	
	public String toString() {
		String r = "Faculty: \n";
		for (Teacher t: teachers)
		{
			r = r + t.toString() + "\n";
		}
		r = r + "\n Student Body: \n";
		for (Student s: students)
		{
			r = r + s.toString() + "\n";
		}
		return r;
	}
	
}