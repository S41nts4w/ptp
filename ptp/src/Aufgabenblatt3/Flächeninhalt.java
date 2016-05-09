/**
 * Praktikum Programmiertechnik (Technische Informatik)
 * SS 2016, Hochschule f�r Angewandte Wissenschaften (HAW), Hamburg
 * Prof. Dr. Philipp Jenke, Prof. Dr. Axel Schmolitzky, Norbert Kasperczyk-Borgmann
 * 
 * Gruppe: Derya Uyargil, Daniel von Drathen
 * 
 * 
 * Aufgabenblatt 3: Bedingte Anweisungen, Schleifen und Arrays
 * 
 * Aufgabe 3.1: Fl�cheninhalt(if else)
 * 
 * Schreiben Sie ein Programm, eine Gr��e x (Flie�kommazahl) und einen Index index (Dezimalzahl)
 * einlie�t. Abh�ngig von dem eingegeben Index berechnet das Programm den Fl�cheninhalt eines Kreises mit
 * dem Radius x (Index 1), den Fl�cheninhalt eines Quadrats mit der Seitenl�nge x (Index 2) oder den
 * Fl�cheninhalt eines Sechsecks (https://de.wikipedia.org/wiki/Sechseck) mit der Seitenl�nge x (Index 3). Der
 * berechnete Fl�cheninhalt wird in einer Variablen abgelegt und am Ende des Programms ausgegeben. F�r
 * ung�ltige Indizes ist der Fl�cheninhalt -1. Schreiben Sie zwei Versionen des Programms, 
 * eine mit Verwendung von if-else, eine mit Verwendung von switch.
 */

package Aufgabenblatt3;

import java.util.Scanner;

public class Fl�cheninhalt {

	public static void main(String[] args) {
		int index = -1;
		double radius, flaecheninhalt;
		Scanner scan = new Scanner(System.in);

		System.out.println("W�hlen sie eine Berechnung?\n " + "\n1 = Fl�cheninhalt eines Kreises "
				+ "\n2 = Fl�cheninhalt eines Quadrats" + "\n3 = Fl�cheninhalt eines Sechsecks");
		index = scan.nextInt();

		System.out.println("Bitte gebe den Radius/die Seitenl�nge ein.");
		radius = scan.nextDouble();
		scan.close();

		if (index == 1) {
			flaecheninhalt = radius * radius * Math.PI;
		} else if (index == 2) {
			flaecheninhalt = radius * radius;
		} else if (index == 3) {
			flaecheninhalt = (radius * radius) * 1.5 * Math.sqrt(3);
		} else {
			flaecheninhalt = -1;
			System.out.println("Ungueltige Eingabe");

		}

		System.out.format("Flaecheninhalt betraegt %.2f cm^2", flaecheninhalt);
	}
}
