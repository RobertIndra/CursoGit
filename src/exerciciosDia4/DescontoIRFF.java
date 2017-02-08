package exerciciosDia4;

import java.util.*;

public class DescontoIRFF {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double descontos = 0;
		double salReajustado;

		System.out.println("Digite seu salário para calculo do IRFF");
		double sal = s.nextDouble();

		if (sal > 0 && sal <= 900) {
			System.out.println("Salário insento de descontos IRFF.");
		} else if (sal > 900 && sal <= 1800) {
			descontos = sal * 0.15;
			salReajustado = sal - descontos;
			System.out.printf("Salário com 15 por cento de desconto de IRFF. Salário reajustado: %.2f", salReajustado);
		} else if (sal > 1800) {
			descontos = sal * 0.275;
			salReajustado = sal - descontos;
			System.out.printf("Salário com 27,5 por cento de desconto de IRFF. Salário reajustado: %.2f", salReajustado);
		}
	}

}
