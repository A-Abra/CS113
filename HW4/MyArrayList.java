package HWFour;

import java.util.*;

public class MyArrayList {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Sirius");
		System.out.println(arr);
		arr.add("Vega");
		System.out.println(arr);
		arr.add("Rigel");
		System.out.println(arr);
		arr.add("Mimosa");
		System.out.println(arr);
		
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("Deneb");
		arr1.add("Spica");
		arr.addAll(arr1);
		System.out.println(arr);
		
		ArrayList<String> arr2 = new ArrayList<>();		
		arr2.addAll(arr.subList(2, 4));
		System.out.println(arr2);
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
	}
}