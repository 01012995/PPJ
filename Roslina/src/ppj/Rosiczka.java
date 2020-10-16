package ppj;

public class Rosiczka extends Roslina implements Miesozerna {

	public Rosiczka(String n, int w) { // konstruktor klasy bazowej
		super(n, w);
	}

	@Override
	public void zjada() {
		System.out.println("Rosiczka zjada owady.");
	}

}
