package exerciciosDia3;

import java.util.*;

public class TesteFuncionario {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		System.out.println("Horas trabalhadas: ");
		func.setHorasTrabalhadas(s.nextDouble());
		System.out.println("Valor da hora trabalhada");
		func.setValorHoras(s.nextDouble());
		
		func.calcularSalario();
		
		System.out.printf("O slario desse funcionário é de: R$ %.2f", func.getSalario());
	}

}
