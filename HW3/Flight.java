package HWThree;

public class Flight {
	private String airline,origin,dest;
	private int flightNum;
	
	public Flight(String airline,String origin,String dest,int flightNum) {
		this.airline=airline;
		this.origin=origin;
		this.dest=dest;
		this.flightNum=flightNum;
	}
	
	public void setaLine(String aline) {
		airline = aline;
	}
	
	public String getaLine() {
		return airline;
	}
	
	public void setOrigin(String origin) {
		this.origin=origin;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public String getDest() {
		return dest;
	}
	
	public void setfNum(int fNum) {
		flightNum = fNum;
	}
	
	public int getfNum() {
		return flightNum;
	}
	
	public String toString() {
		return "Airline: "+airline+", Flight number: "+flightNum+", From: "
				+origin+", To: "+dest;
	}
}