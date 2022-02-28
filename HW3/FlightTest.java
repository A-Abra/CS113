package HWThree;

public class FlightTest {

	public static void main(String[] args) {
		Flight f = new Flight("Emirates","Spain","London",003275);
		System.out.println(f);
		f.setDest("Delhi");
		System.out.println(f.getfNum());
		System.out.println(f);
		f.setaLine("Etihad");
		System.out.println(f.getDest());
		f.setOrigin("Newark");
		System.out.println(f.getOrigin());
		System.out.println(f);
	}
}