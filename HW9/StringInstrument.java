package HWNine;

public class StringInstrument extends Instrument{
	private int numStr,numFret;
	
	public void setNumStr(int s) {
		numStr = s;
	}
	public void setNumFret(int f) {
		numFret = f;
	}
	public int getNumStr() {
		return numStr;
	}
	public int getNumFret() {
		return numFret;
	}
	public void printInfo() {
		super.printInfo();
		//numStr and numFret printed in main
	}
}