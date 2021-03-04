/*
* Author: Mert Uzeken
* Email: mertuzeken@gmail.com
* Github: https://github.com/MertUzeken
*/

package KlausurvorbereitungMilestone;

class Elektroauto extends Auto{
	double AkkuKapazit�t;
	double Reichweite;

	
	public Elektroauto(Fahrzeugtyp fahrzeugtyp, String farbe, double Akkukapazit�t, double Reichweite) {
		super(fahrzeugtyp, farbe);
		this.AkkuKapazit�t = Akkukapazit�t;
		this.Reichweite = Reichweite;
	}
	
	public void displayInformation() {
		System.out.printf("Elektroauto: ID: %d %s, %s, %s, %1.2f, %1.2f \n", ID, fahrzeugtyp.hersteller,fahrzeugtyp.modell, Farbe, AkkuKapazit�t, Reichweite);
	}
}