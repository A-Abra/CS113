package HWFour;

import java.util.*;

public class Golf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int temp = s.nextInt();
		int humid = s.nextInt();
		if(temp>88 || humid>94)
			System.out.println("Members cannot play golf at this time");
		else
			System.out.println("Members can play golf at this time");
	} 
}