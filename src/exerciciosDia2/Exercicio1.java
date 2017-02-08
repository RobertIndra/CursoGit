package exerciciosDia2;
import java.util.*;


public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int numeros[] = new int[10];
		
		System.out.println("Digite um numero");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = s.nextInt();
			
			for (int a = 0; a < i; a++) {
				if (numeros[i] == numeros[a]) {
					System.out.println("Não é permitido numeros repitidos. Digite outro valor");
				}
			}
		}
		for (int aux : numeros) {
			System.out.println(aux);
		}				
	}
}
