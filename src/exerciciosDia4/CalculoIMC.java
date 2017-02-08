package exerciciosDia4;

import java.util.*;

public class CalculoIMC {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Digite sua altura");
		double altura = s.nextDouble();
		System.out.println("Digite seu peso");
		double peso = s.nextDouble();

		double imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Acima do peso");
		} else if (imc >= 30) {
			System.out.println("Obeso");
		}
	}

}
