package HWNine;

import java.util.Scanner;
public class InstrumentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

	    Instrument myInstrument = new Instrument();
	    StringInstrument myStringInstrument = new StringInstrument();

	    String instrumentName, manufacturerName, stringInstrumentName, stringManufacturer;
	    int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;

	    System.out.println("Enter data here: ");

	    instrumentName = scnr.nextLine();
	    manufacturerName = scnr.nextLine();
	    yearBuilt = scnr.nextInt();
	    scnr.nextLine();
	    cost = scnr.nextInt();
	    scnr.nextLine();
	    stringInstrumentName = scnr.nextLine();
	    stringManufacturer = scnr.nextLine();
	    stringYearBuilt = scnr.nextInt();
	    stringCost = scnr.nextInt();
	    numStrings = scnr.nextInt();
	    numFrets = scnr.nextInt();

	    myInstrument.setName(instrumentName);
	    myInstrument.setManu(manufacturerName);
	    myInstrument.setYearBuilt(yearBuilt);
	    myInstrument.setCost(cost);
	    myInstrument.printInfo();

	    myStringInstrument.setName(stringInstrumentName);
	    myStringInstrument.setManu(stringManufacturer);
	    myStringInstrument.setYearBuilt(stringYearBuilt);
	    myStringInstrument.setCost(stringCost);
	    myStringInstrument.setNumStr(numStrings);
	    myStringInstrument.setNumFret(numFrets);
	    myStringInstrument.printInfo();

	    System.out.println("Number of strings: " + myStringInstrument.getNumStr());
	    System.out.println("Number of frets: " + myStringInstrument.getNumFret());
	}
}
