package exerciciosDia2;
import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		int vetorA[] = {7, 5, 9, 10, 100, 7, 90, 45, 22, 45};
		int vetorB[] = {6, 1, 25, 27, 91, 1, 2, 45, 77, 71};
		
		int vetorC[] = new int[20];
		
		for (int i = 0; i < vetorC.length; i++) {
			if (i % 2 == 0) {
				 
				vetorC[i] = vetorA[(i / 2)];
			} else if (i % 2 != 0) {
				
				vetorC[i] = vetorB[(i + 1) / 2];
			}
			
		}
		 for ( int aux : vetorC) {
			 System.out.println(aux);
		 }

	}

}
