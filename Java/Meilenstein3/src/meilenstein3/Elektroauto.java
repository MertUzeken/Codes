// Mert Uzeken
// Matrikel-Nr: 1142543

package meilenstein3;

public class Elektroauto {
	private double akkukapazit�t;
	private double reichweite;
	private String farbe;

	public void SetAkkukapazit�t(double akkukapazit�t) {
		this.akkukapazit�t = akkukapazit�t;
	}

	public void SetReichweite(double reichweite) {
		this.reichweite = reichweite;
	}

	public double getAkkukapazit�t() {
		return this.akkukapazit�t;
	}

	public double getReichweite() {
		return this.reichweite;
	}

	Elektroauto(Fahrzeugtyp fahrzeugtyp, String farbe, double akkukapazit�t, double reichweite) {
		this.akkukapazit�t = akkukapazit�t;
		this.reichweite = reichweite;
		this.farbe = farbe;
	}

}
