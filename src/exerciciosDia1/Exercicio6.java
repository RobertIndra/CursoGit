package exerciciosDia1;

import java.util.*;

public class Exercicio6 {
	/*
	 * 6. Fazer um programa para ler o nome, 2 notas, mostrar a média com a
	 * mensagem: Inferior a 5,0 – “Reprovado” De 5,1 a 6,9 – “Recuperação” De
	 * 7,0 a 10 – “Aprovado” Obs: mostrar o nome.
	 * 
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		try {
			System.out.println("Seu nome: ");
			String nome = s.next();
			System.out.println("Nota 1: ");
			float nota1 = s.nextFloat();
			System.out.println("Nota 2: ");
			float nota2 = s.nextFloat();

			float media = (nota1 + nota2) / 2;

			if (media <= 5.0) {

				System.out.println(nome + " Media: " + media + " Reprovado");
			} else if (media >= 5.1 && media <= 6.9) {

				System.out.println(nome + " Media: " + media + " Recuperação");
			} else if (media >= 7.0 && media <= 10) {

				System.out.println(nome + " Media: " + media + " Aprovado");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
