package exerciciosDia1;

import java.util.*;

public class Exercicio3 {
	/*
	 * 3. Para doar sangue � necess�rio ter entre 18 e 67 anos. Fa�a um
	 * aplicativo na linguagem Java que pergunte a idade de uma pessoa e diga se
	 * ela pode doar sangue ou n�o.
	 */

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		System.out.println("Digite sua idade");
		try {

			int idade = n.nextInt();

			if (idade >= 18 && idade <= 67) {

				System.out.println("Pode doar sangue");
			} else {

				System.out.println("N�o pode doar sangue");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
