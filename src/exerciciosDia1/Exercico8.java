package exerciciosDia1;
import java.util.*;

public class Exercico8 {

	/*
	 * 8. Faça um programa que lê um número N e escreve todos os números de 1 a
	 * N
	 */

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Digite um numero");
			int n = s.nextInt();
			
			for(int i = 0; i <= n; i++) {
				System.out.println(i);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
