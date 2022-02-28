package HWFour;

import java.util.*;

public class SlotMachine {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			int one = (int)(Math.random()*10);
			int two = (int)(Math.random()*10);
			int three = (int)(Math.random()*10);
			System.out.println(""+one+two+three);
			if(one==two && one==three)
				System.out.println("Jackpot");
			else if((one==two)||(two==three)||(one==three))
				System.out.println("Double");
			System.out.println("Y to continue or N to stop");
			String done = s.nextLine();
			if(done.equals("N")||done.equals("n"))
				break;
		}
	}
}