package HWFive;

import java.util.*;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int acnt = 0;
		int ecnt = 0;
		int icnt = 0;
		int ncnt = 0;
		int ocnt = 0;
		int ucnt = 0;
		for (int i = 0; i < s.length(); i++) {
			switch(i) {
			case 'a':
				acnt++;
			case 'e':
				ecnt++;
			case 'i':
				icnt++;
			case 'o':
				ocnt++;
			case 'u':
				ucnt++;
			default:
				ncnt++;
			}
		}
		System.out.println("Num of each lowercase vowel in string:");
		System.out.println("a:"+acnt);
		System.out.println("e:"+ecnt);
		System.out.println("i:"+icnt);
		System.out.println("o:"+ocnt);
		System.out.println("u:"+ucnt);
		System.out.println("other chars:"+ncnt);
	}
}