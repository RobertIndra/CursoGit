package praticasDia1;

import java.util.*;

public class PraticaCondicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner n = new Scanner(System.in);
		boolean a = false;
		boolean b = false;
		boolean c = false;

		System.out.println("Digite um n�mero:");

		try {
			int num = n.nextInt();
			if (num > 12) {

				System.out.println("Condi��o A: Maior que 12");
				a = true;
			}
			if (num < 20) {

				System.out.println("Condi��o B: Menor que 20");
				b = true;

			}
			if (num > 18 && num < 50) {

				System.out.println("Condi��o C: N�mero esta entre 19 e 49");
				c = true;

			}
			if (a == true && b == true) {

				System.out.println("Atendeu as condi��es A e B");
			}

			if (b == true || c == true) {

				System.out.println("Atendeu as condi��es B ou C");
			}
			if (a == true) {

				System.out.println("Atendeu a condi��o A");
			}
			if (b == true) {

				System.out.println("Atendeu a condi��o B");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
