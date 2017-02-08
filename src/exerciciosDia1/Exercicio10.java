package exerciciosDia1;

import java.util.*;

public class Exercicio10 {

	/*
	 * 10. Escreva um programa que lê o tamanho do lado de um quadrado e imprime
	 * um quadrado daquele tamanho com asteriscos. Seu programa deve funcionar
	 * para quadrados com lados de todos os tamanhos entre 1 e 20. Por exemplo,
	 * para lado igual a 5:
	 *	*****
	 *	*****
	 *	*****
	 *	*****
	 *	*****
	 * 
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Digite o lado do quadrado");

		try {

			int n = s.nextInt();
			if (n >= 1 && n <= 20) {
				for (int i = 1; i <= n; i++) {
					for (int a = 1; a <= n; a++) {
						System.out.print("*");
					}
					System.out.println();
				}
			} else {
				System.out.println("Numero invalido. Digite valores entre 1 a 20");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
