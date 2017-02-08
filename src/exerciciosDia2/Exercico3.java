package exerciciosDia2;
import java.util.*;

import jdk.management.resource.internal.inst.NetRMHooks;

public class Exercico3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Integer numsDesordem[] = new Integer[10];
		int numsEmOrdem[] = new int[10];
		
		System.out.println("Digite 10 numeros");
		for (int i = 0; i < numsDesordem.length; i++) {
			numsDesordem[i] = s.nextInt();
		}
		Arrays.sort(numsDesordem);
		int a = 0;
		while (a < numsEmOrdem.length) {
			for (int aux : numsDesordem) {
				numsEmOrdem[a] = aux;
				a++;
			}
		}
		for (int imp : numsEmOrdem) {
			System.out.println(imp);
		}
	}

}
