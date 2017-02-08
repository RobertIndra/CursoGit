package exerciciosDia1;

import java.util.*;

public class Exercico9 {
	/*
	 * 9. Escreva um programa que solicita 10 números ao usuário, através de um
	 * laço while, e ao final mostre os dois maiores números digitados pelo
	 * usuário.
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 1;
		
		try {
			
			System.out.println("Digite 10 numeros");
			while (count <= 10){
				
				list.add(s.nextInt());
				count++;
			}
			
			
			Collections.sort(list);
			System.out.println("Os dois maiores numeros são: " + list.get(8) + " e "+ list.get(9));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
