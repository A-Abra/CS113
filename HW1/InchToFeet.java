package HWOne;
import java.util.*;

public class InchToFeet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number in inches");
		double inch = s.nextDouble();
		System.out.println("Converted to feet: "+(inch/12.0));
	}

}
