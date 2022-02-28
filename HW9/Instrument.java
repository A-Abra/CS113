package HWNine;

public class Instrument {
	private String inst,manu;
	private int year,cost;
	
	public void setName(String n) {
		inst = n;
	}
	public void setManu(String m) {
		manu = m;
	}
	public void setYearBuilt(int y) {
		year = y;
	}
	public void setCost(int c) {
		cost = c;
	}
	public void printInfo() {
		System.out.println();
		System.out.println("Instrument: "+inst);
		System.out.println("Manufacturer: "+manu);
		System.out.println("Year Built: "+year);
		System.out.println("Cost: $"+cost);
	}
}