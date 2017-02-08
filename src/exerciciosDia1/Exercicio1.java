package exerciciosDia1;

import java.util.*;

public class Exercicio1 {

	/*
	 * 1. Faça um programa que receba três inteiros e diga qual deles é o maior
	 * e qual o menor. Consegue criar mais de uma solução?
	 */
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		System.out.println("Digite 3 números");

		try {
			int num1 = n.nextInt();
			int num2 = n.nextInt();
			int num3 = n.nextInt();

			if (num1 >= num2 && num2 >= num3) {

				System.out.println(num1 + "é o maior numero");
				System.out.println(num3 + "é o menor numero");
			} else if (num1 >= num2 && num2 <= num3) {

				System.out.println(num1 + "é o maior numero");
				System.out.println(num2 + "é o menor numero");
			} else if (num2 >= num3 && num1 >= num3){
				
				System.out.println(num2 + "é o maior numero");
				System.out.println(num3 + "é o menor numero");
			} else if (num2 >= num3 && num1 <= num3){
				
				System.out.println(num2 + "é o maior numero");
				System.out.println(num1 + "é o menor numero");
			} else if (num3 >= num1 && num1 >= num2){
				
				System.out.println(num3 + "é o maior numero");
				System.out.println(num2 + "é o menor numero");
			} else if (num3 >= num2 && num2 >= num1){
				
				System.out.println(num3 + "é o maior numero");
				System.out.println(num1 + "é o menor numero");
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
