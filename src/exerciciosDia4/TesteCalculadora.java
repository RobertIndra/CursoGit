package exerciciosDia4;

import java.util.*;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.println("Digite 2 n�meros a serem efetuados");
		calc.setEntrada1(s.nextInt());
		calc.setEntrada2(s.nextInt());
		
		calc.somar();
		calc.subtrair();
		
		System.out.println("A valaor da soma �: " + calc.getTotalSoma());
		System.out.println("A valaor da subtra��o �: " + calc.getTotalSubtracao());
	}

}
