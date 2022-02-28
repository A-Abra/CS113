package HWThree;

public class Grades {

	public static void main(String[] args) {
		Student mike = new Student("Mike");
		Student mary = new Student("Mary");
		mike.inputGrades();
		mary.inputGrades();
		System.out.println(mary.getName());
		System.out.println(mike);
		System.out.println(mary);
	}
}