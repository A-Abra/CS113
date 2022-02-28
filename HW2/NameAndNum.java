package HWTwo;
import java.util.*;

public class NameAndNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int rad = 3;
		
		System.out.println("Input your first and last name each on their own lines");
		String first = s.nextLine();
		String last = s.nextLine();
		
		System.out.println(first.charAt(0)); // or first.substring(0,1);
		System.out.println(last.substring(0, 5));
		System.out.println(r.nextInt(90)+10);
		
	}
}