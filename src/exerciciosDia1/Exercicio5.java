package exerciciosDia1;

import java.util.*;

public class Exercicio5 {
	/*
	 * 5. Crie uma calculadora usando a instru��o SWITCH, que pergunte qual das
	 * opera��es b�sicas quer fazer (+, -, * e /), em seguida pe�a os dois
	 * n�meros e mostre o resultado da opera��o matem�tica entre eles.
	 */

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		
		
		
		try {
			System.out.println("Digite a opera��o (+ ou - ou * ou /)");
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
				System.out.println("Opera��o inv�lida. Digite entre as opera��es possiveis  (+, -, *, /");
			}
			
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
