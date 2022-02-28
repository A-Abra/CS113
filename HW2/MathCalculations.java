package HWTwo;
import java.text.DecimalFormat;
import java.util.*;

public class MathCalculations {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter a decimal num");
		double r = s.nextDouble();
		double h = rand.nextDouble()*5;
		System.out.println("Radius: "+r+", Height: "+h);
		System.out.println("Max value: "+Math.max(r, h)+" Min value: "+Math.min(r, h));
		
		double vol = Math.PI*Math.pow(r,2)*h;
		double area = 2*Math.PI*r*h;
		DecimalFormat fig = new DecimalFormat("0.###");
		System.out.println("Volume of cylinder: "+fig.format(vol));
		System.out.println("Surface area of cylinder: "+fig.format(area));
	}
}