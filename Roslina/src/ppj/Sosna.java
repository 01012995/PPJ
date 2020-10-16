package ppj;

public class Sosna extends Roslina {
	private int wysokosc; // w cm
	private int limitWys = 6300; // limit wysokosci sosny

	public Sosna(String n, int w, int wys) { // konstruktor klasy bazowej + wysokoœæ
		super(n, w);
		wysokosc = wys;
	}

	public void rosnie(int up) { // sosna rosnie do limitWys 6300cm
		if (dorosla())
			return; // dorosla sosna nie rosnie
		else if (!dorosla() && wysokosc + up < limitWys)
			wysokosc += up;
		else
			wysokosc = limitWys;
	}

	public int getWysokosc() { // daj wysokosc
		return wysokosc;
	}

	public boolean dorosla() { // czy sosna dorosla
		if (wysokosc >= limitWys)
			return true;
		return false;
	}

}
