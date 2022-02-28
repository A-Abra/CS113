package HWSix;

public class TaskDriver {
	public static void main(String[] args) {
		Task one = new Task("dishes",2);
		Task two = new Task("laundry",3);
		System.out.println(one.toString());
		System.out.println(two.toString());
		two.setPriority (1);
		System.out.println(one.toString());
		System.out.println(two.toString());
	}
}