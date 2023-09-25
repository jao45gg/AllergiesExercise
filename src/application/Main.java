package application;

import java.util.Scanner;

import entities.CalculateAllergies;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer allergyScore = 0;
		
		while (allergyScore != -1) {
			allergyScore = Integer.parseInt(sc.nextLine());
			CalculateAllergies allergies = new CalculateAllergies();

			allergies.calcularAlergias(allergyScore);
			allergies.imprimirAlergias();
		}
		sc.close();
	}

}
