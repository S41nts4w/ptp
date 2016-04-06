package Aufgabenblatt3;

import java.util.Scanner;

public class Fl�cheninhaltSwitch {

	public static void main(String[] args) {
		float x = -1;
		int index = -1;
		Scanner scan = new Scanner(System.in);

		System.out.println("W�hlen sie eine Berechnung?\n " + "\n1 = Fl�cheninhalt eines Kreises "
				+ "\n2 = Fl�cheninhalt eines Quadrats" + "\n3 = Fl�cheninhalt eines Sechsecks");
		index = scan.nextInt();

		switch (index) {

		case 1: {
			System.out.println("Bitte Fliesskommazahl in cm zur Berechnung des Fl�cheninhalts eines Kreises");
			x = scan.nextFloat();
			System.out.println("Der Fl�cheninhalt des Kreises betr�gt " + Math.PI * (x * x) + " cm^2");
			break;
		}
		case 2: {
			System.out.println("Bitte Fliesskommazahl in cm zur Berechnung der Seitenl�nge eines Quadrats angeben");
			x = scan.nextFloat();
			System.out.println("Der Fl�cheninhalt des Quadrats betr�gt " + x * x + " cm^2");
			break;
		}

		case 3: {
			System.out.println("Bitte Fliesskommazahl in cm zur Berechnung der Seitenl�nge angeben eines Sechsecks");
			x = scan.nextFloat();
			System.out.println("Der Fl�cheninhalt des Quadrats betr�gt " + 1.5 * (x * x) * (Math.sqrt(3)) + " cm^2");
			break;
		}
		default: {

			System.out.println("Ung�ltige Eingabe");

		}
			scan.close();
		}
	}
}
