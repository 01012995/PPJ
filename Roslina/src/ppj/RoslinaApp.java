package ppj;

public class RoslinaApp {

	public static void main(String[] args) {
		Sosna sosnaCzerw = new Sosna("Sosna czerwona �ac. Pinus Resinosa", 25, 6000); // Nowy obiekt Sosna. max 6300)!
		Sosna sosnaZwy = new Sosna("Sosna zwyczajna �ac. Pinus sylvestris", 81, 3100); // Nowa sosna (zwyczajna)
		Rosiczka rosi = new Rosiczka("Rosiczka okr�g�olistna �ac. Drosera Rotundifolia", 1); // Nowy obiekt Rosiczka.

		// wydruk dla sosny czerwonej
		System.out.println("Ta ro�lina to " + sosnaCzerw.getNazwa() + ". Ma " + sosnaCzerw.getWiek() + "lat."
				+ " Mierzy: " + sosnaCzerw.getWysokosc() + "cm.");
		sosnaCzerw.rosnie(34); // sosna czerwona ro�nie
		System.out.println("Za rok powinna mierzy�: " + sosnaCzerw.getWysokosc());
		System.out.println();

		// wydruk dla sosny zwyczajnej
		System.out.println("Ta ro�lina to " + sosnaZwy.getNazwa() + ". Ma " + sosnaZwy.getWiek() + "lat." + " Mierzy: "
				+ sosnaZwy.getWysokosc() + "cm.");
		sosnaZwy.urodziny(); // sosna zwyczajna +1rok
		System.out.println("Za rok b�dzie mia�a " + sosnaZwy.getWiek() + " lat.");
		System.out.println();

		// wydruk dla rosiczki
		System.out.println("Ta ro�lina to " + rosi.getNazwa() + ". Ma " + rosi.getWiek() * 12 + " miesi�cy.");
		rosi.zjada();
		rosi.urodziny();
		System.out.println("Za rok b�dzie mia�a " + rosi.getWiek()*12 + " miesi�cy.");
	}
}
