package HWThree;

import java.util.*;

public class Student {
	private String name;
	private int score1, score2;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void inputGrades() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter scores for "+name+"'s test1 and test2 seperated by a space");
		score1 = s.nextInt();
		score2 = s.nextInt();
	}
	
	public int getAverage() {
		return (score1+score2)/2;
	}
	
	public String toString() {
		return "Student name: "+name+"\nAverage score: "+getAverage();
	}
}