package exerciciosDia4;

public class TesteSalario {

	public static void main(String[] args) {

		Empregado emp = new Empregado("Jo�o", "Analista de sistemas", 5400);
		emp.aumentarSalario(600);

		System.out.printf("Nome do empregado: " + emp.getNome() + " Fun��o: " + emp.getFuncao() + " Sal�rio R$ %.2f",
				emp.getSalario());

	}

}
