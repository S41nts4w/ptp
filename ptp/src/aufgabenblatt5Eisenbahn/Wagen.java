/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Daniel von Drathen,
 * Derya Uyargil
 * Aufgabe: Aufgabenblatt 5, Aufgabe 2
 */

/**
 * Klasse für ein Wagenobjekt.
 * 
 */

package aufgabenblatt5Eisenbahn;

public class Wagen {
	
	private final int laenge;
	private final int kapazitaet;
	private Wagen naechsterWagen;
	
	static int wagenZaehler = 1;
	private final int Seriennummer;

	public Wagen(int laenge, int kapazitaet) {
		this.laenge = laenge;
		this.kapazitaet = kapazitaet;

		Seriennummer = wagenZaehler;
		Wagen.wagenZaehler++;
		naechsterWagen = null;
	}

	public Wagen getnaechsterWagen() {
		return naechsterWagen;

	}

	public int getKapazitaet() {
		return kapazitaet;
	}

	public int getLaenge() {
		return laenge;
	}

	public int getSeriennummer() {
		return Seriennummer;
	}

	public void setNaechsterWagen(Wagen naechsterWagen) {
		this.naechsterWagen = naechsterWagen;

	}
	// comment
}
