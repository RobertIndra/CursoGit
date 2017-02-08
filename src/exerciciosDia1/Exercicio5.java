package exerciciosDia1;

import java.util.*;

public class Exercicio5 {
	/*
	 * 5. Crie uma calculadora usando a instrução SWITCH, que pergunte qual das
	 * operações básicas quer fazer (+, -, * e /), em seguida peça os dois
	 * números e mostre o resultado da operação matemática entre eles.
	 */

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		
		
		
		try {
			System.out.println("Digite a operação (+ ou - ou * ou /)");
			String op = n.next();
			System.out.println("Digite os dois valores a serem calculados");
			int n1 = n.nextInt();
			int n2 = n.nextInt();
				
			
			switch (op)
			{
			case "+" :
				System.out.println("Resultado: " + n1 + " + " + n2 + " = " + (n1 + n2));
				break;
			case "-" :
				System.out.println("Resultado: " + n1 + " - " + n2 + " = " + (n1 - n2));
				break;
			case "*" :
				System.out.println("Resultado: " + n1 + " * " + n2 + " = " + (n1 * n2));
				break;	
			case "/" :
				System.out.println("Resultado: " + n1 + " / " + n2 + " = " + (n1 / n2));
				break;	
			default :
				System.out.println("Operação inválida. Digite entre as operações possiveis  (+, -, *, /");
			}
			
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
