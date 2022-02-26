package HWOne;
import java.util.*;

public class WeightToMilli {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your weight:");
		System.out.println("Kilograms:");
		int kilo = s.nextInt();
		System.out.println("Grams:");
		int gram = s.nextInt();
		System.out.println("Milligrams:");
		int milli = s.nextInt();
		int total = kilo*1000000+gram*1000+milli;
		System.out.println("Your weight in milligrams: "+total);
	}
}