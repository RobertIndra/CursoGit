package praticasDia2;

import java.util.*;

public class ArrayDeNomes {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String arrayDeNomes[] = new String[10];

		try {

			System.out.println("Digite 10 nomes");
			for (int i = 0; i < 10; i++) {
				arrayDeNomes[i] = s.next();
			}

			for (String aux : arrayDeNomes) {
				System.out.println(aux);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
