package HWFive;

public class MultTable {
	public static void main(String[] args) {
		int max = 12;
		int num = 0;
		for (int r = 1; r <= 12; r++) {
			for (int c = 1; c <= 12; c++) {
				System.out.print(r*c+"\t");
				if(c==12)
					System.out.println();
			}
		}
	}
}