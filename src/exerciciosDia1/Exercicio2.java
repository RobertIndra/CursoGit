package exerciciosDia1;

import java.util.*;

public class Exercicio2 {
	/*
	 * 2. Escreva um programa em Java que recebe um inteiro e diga se é par ou
	 * ímpar. Use o operador matemático % (resto da divisão ou módulo) e o teste
	 * condicional if.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		
		try {
			int num = n.nextInt();
			int resto = num % 2;
			
			if(resto == 0) {
				
				System.out.println("Numero par");
			} else {
				
				System.out.println("Numero impar");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
