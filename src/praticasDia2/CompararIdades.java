package praticasDia2;
import java.util.*;

public class CompararIdades {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite duas idades");
			
			int idade1 = s.nextInt();
			int idade2 = s.nextInt();
			
			if( idade1 > idade2) {
				
				System.out.println(idade1 + " é a maior idade");
			} else if (idade1 == idade2) {
				
				System.out.println("As duas idades são iguais");
			} else {
				
				System.out.println(idade2 + " é a maior idade");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
