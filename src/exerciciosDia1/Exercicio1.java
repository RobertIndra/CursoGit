package exerciciosDia1;

import java.util.*;

public class Exercicio1 {

	/*
	 * 1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior
	 * e qual o menor. Consegue criar mais de uma solu��o?
	 */
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		System.out.println("Digite 3 n�meros");

		try {
			int num1 = n.nextInt();
			int num2 = n.nextInt();
			int num3 = n.nextInt();

			if (num1 >= num2 && num2 >= num3) {

				System.out.println(num1 + "� o maior numero");
				System.out.println(num3 + "� o menor numero");
			} else if (num1 >= num2 && num2 <= num3) {

				System.out.println(num1 + "� o maior numero");
				System.out.println(num2 + "� o menor numero");
			} else if (num2 >= num3 && num1 >= num3){
				
				System.out.println(num2 + "� o maior numero");
				System.out.println(num3 + "� o menor numero");
			} else if (num2 >= num3 && num1 <= num3){
				
				System.out.println(num2 + "� o maior numero");
				System.out.println(num1 + "� o menor numero");
			} else if (num3 >= num1 && num1 >= num2){
				
				System.out.println(num3 + "� o maior numero");
				System.out.println(num2 + "� o menor numero");
			} else if (num3 >= num2 && num2 >= num1){
				
				System.out.println(num3 + "� o maior numero");
				System.out.println(num1 + "� o menor numero");
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
