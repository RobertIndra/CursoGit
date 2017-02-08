package praticasDia2;

import java.util.*;

public class PraticaSwitch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		try {

			System.out.println("Digite as seguintes operações (i = inclusão; a = alteração; e = exclusão)");
			//char c = s.next().charAt(0);
			String op = s.next();

			switch (op) {
			case "i":
				System.out.println("Inclusão iniciada");
				break;
			case "a":
				System.out.println("Alteração iniciada");
				break;
			case "e":
				System.out.println("Exclusão iniciada");
				break;	
			default:
				System.out.println("Valor inserido inválido. Insira seguindo o padrão (i = inclusão; a = alteração; e = exclusão)");
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
