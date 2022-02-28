package HWSeven;

import java.util.*;

public class Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[][] info = new String[4][3];
		for(int i = 0; i < info.length; i++) {
			System.out.println("Enter first/last name and zipcode");
			for(int j = 0; j < info[0].length; j++)
				info[i][j] = s.nextLine();
		}
		
		for (int i = 0; i < info.length; i++) {
			System.out.println();
			System.out.println("Input"+(i+1));
			for (int j = 0; j < info[0].length; j++)
				System.out.println(info[i][j]);
		}
	}
}