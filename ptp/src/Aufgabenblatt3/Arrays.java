package Aufgabenblatt3;

public class Arrays {

	public static void main(String[] args) {
		// Mehrdimensionaler Array
		int[] tag = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int[] temperatur = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 };

		// Mittelwert bestimmen
		double mittelwert = 0;
		for (int i = 0; i < temperatur.length; i++) {
			mittelwert += temperatur[i];
		}
		mittelwert /= temperatur.length;
		System.out.format("Die Durchschnittstemperatur f�r die zwei Wochen betr�gt: %.1f Grad Celsius.\n", mittelwert);

		// Maximum bestimmen
		int tempmax = temperatur[0];
		for (int i = 0; i < temperatur.length; i++) {
			if (tempmax < temperatur[i]) {
				tempmax = temperatur[i];
			}
		}
		System.out.println("\nDie h�chste Temperatur betr�gt: " + tempmax + " Grad Celsius.");

		// Minimum bestimmen
		int tempmin = temperatur[0];
		for (int i = 0; i < temperatur.length; i++) {
			if (tempmin > temperatur[i]) {
				tempmin = temperatur[i];
			}
		}
		System.out.println("\nDie niedrigste Temperatur betr�gt: " + tempmin + " Grad Celsius.");

		// Temperaturunterschied

		int indextag1 = +1;
		int indextag2 = 0;
		int diffmax = 0;
		int diff = Math.abs(temperatur[0] - temperatur[1]);
		for (int i = 1; i < temperatur.length; i++) {
			if (diff < Math.abs(temperatur[i] - temperatur[i - 1])) {
				diff = Math.abs(temperatur[i] - temperatur[i - 1]);
				diffmax = diff;
				indextag2 = i;
			}
		}

		System.out.println("\nDer H�chste Temperaturunterschied von zwei auffeinanderfolgenden Tagen betr�gt: "
				+ diffmax + " Grad Celsius und ist zwischen Tag " + indextag1 + " und Tag " + indextag2 + ".");

		// Table
		System.out.println("\n| *****TAG***** |  *TEMPERATUR* |");

		for (int i = 0; i < temperatur.length; i++) {
			System.out.println("|\t" + tag[i] + "\t|\t" + temperatur[i] + "\t|");

		}

	}

}