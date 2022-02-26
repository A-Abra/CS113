package HWOne;
import java.util.*;
public class Convertmilligrams {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your weight in milligrams:");
		int weight = s.nextInt();
		int kilo = weight/1000000;
		int gram = (weight-kilo*1000000)/1000;
		int milli = (weight-kilo*1000000)-(gram*1000);
		System.out.println("Your weight in kilos, grams, and milligrams: "+kilo+" kilos "+gram+" grams "+milli+" milligrans");
	}
}