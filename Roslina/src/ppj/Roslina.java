package ppj;

public abstract class Roslina { // klasa abstrakcyjna Roslina. Dwa parametry - nazwa i wiek
	private int wiek;
	private String nazwa;
	
	public Roslina(String n, int w) { // konstruktor
		wiek=w;
		nazwa=n;
	}

	public String getNazwa() { 
		return nazwa;
	};

	public int getWiek() {
		return wiek;
	};

	public void urodziny() { //zwiêkszamy wiek o rok
		wiek++;
	};

}
