package exerciciosDia4;

public class TesteSalario {

	public static void main(String[] args) {

		Empregado emp = new Empregado("João", "Analista de sistemas", 5400);
		emp.aumentarSalario(600);

		System.out.printf("Nome do empregado: " + emp.getNome() + " Função: " + emp.getFuncao() + " Salário R$ %.2f",
				emp.getSalario());

	}

}
