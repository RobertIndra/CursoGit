package praticasDia2;

import java.util.*;

public class PraticaSwitch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		try {

			System.out.println("Digite as seguintes opera��es (i = inclus�o; a = altera��o; e = exclus�o)");
			//char c = s.next().charAt(0);
			String op = s.next();

			switch (op) {
			case "i":
				System.out.println("Inclus�o iniciada");
				break;
			case "a":
				System.out.println("Altera��o iniciada");
				break;
			case "e":
				System.out.println("Exclus�o iniciada");
				break;	
			default:
				System.out.println("Valor inserido inv�lido. Insira seguindo o padr�o (i = inclus�o; a = altera��o; e = exclus�o)");
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
