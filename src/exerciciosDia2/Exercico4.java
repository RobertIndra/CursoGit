package exerciciosDia2;

import java.util.*;

public class Exercico4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Integer numeros[] = new Integer[10];

		System.out.println("Digite 10 numeros");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = s.nextInt();
		}
		Arrays.sort(numeros, Collections.reverseOrder());
		
		for (int aux : numeros) {
			System.out.println(aux);
		}
		
	}

}
