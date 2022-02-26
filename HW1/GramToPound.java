package HWOne;
import java.util.*;

public class GramToPound {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number in grams");
		double grams = s.nextDouble();
		System.out.println("Converted to pounds: "+(grams/453.592));
	}

}