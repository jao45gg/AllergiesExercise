package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateAllergies {
	private final Integer baseNum = 2;
	private Map<Integer, String> allergies = new HashMap<Integer, String>();
	private List<String> userAllergies = new ArrayList<String>();

	public CalculateAllergies() {
		allergies.put(1, "eggs");
		allergies.put(2, "peanuts");
		allergies.put(4, "shellfish");
		allergies.put(8, "strawberries");
		allergies.put(16, "tomatoes");
		allergies.put(32, "chocolate");
		allergies.put(64, "pollen");
		allergies.put(128, "cats");
	}

	private Integer calcularMaiorDivisor(Integer num) {
		Integer divisor = 1;
		while (divisor <= num) {
			divisor *= baseNum;
		}
		return (divisor >= 2) ? divisor / baseNum : divisor;
	}

	public void calcularAlergias(Integer allergyScore) {
		Integer divisor = calcularMaiorDivisor(allergyScore);
		Integer resto = 0;

		do {
			resto = allergyScore % divisor;

			if (allergies.get(divisor) != null)
				userAllergies.add(allergies.get(divisor));

			divisor = calcularMaiorDivisor(resto);

		} while (resto > 0);

	}

	public void imprimirAlergias() {
		if (userAllergies.size() > 0) {
			for (int i = 0; i < userAllergies.size(); i++) {
				System.out.println("Você é alergico a: " + userAllergies.get(i));
			}
		} else {
			System.out.println("Você não tem alergias ! Ou suas alergias não estão em nossa base de dados !");
		}

	}

}
