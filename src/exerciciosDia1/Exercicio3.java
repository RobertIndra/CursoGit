package exerciciosDia1;

import java.util.*;

public class Exercicio3 {
	/*
	 * 3. Para doar sangue é necessário ter entre 18 e 67 anos. Faça um
	 * aplicativo na linguagem Java que pergunte a idade de uma pessoa e diga se
	 * ela pode doar sangue ou não.
	 */

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		System.out.println("Digite sua idade");
		try {

			int idade = n.nextInt();

			if (idade >= 18 && idade <= 67) {

				System.out.println("Pode doar sangue");
			} else {

				System.out.println("Não pode doar sangue");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
