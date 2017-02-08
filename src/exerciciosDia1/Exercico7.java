package exerciciosDia1;
import java.util.*;

public class Exercico7 {

	/*
	 * Faça um programa que leia 3 números inteiros e os imprima em ordem
	 * crescente
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			System.out.println("Digite 3 números");
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			int n3 = s.nextInt();
			list.add(n1);
			list.add(n2);
			list.add(n3);
			
			Collections.sort(list);
			System.out.println(list);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	

}
