package exerciciosDia3;

public class ContaCorrente {

	public String titular;
	public int agendiaContaCorrente;
	public String numeroContaCorrente;
	public double saldo;

	public double deposito(double valor) {
		saldo = saldo + valor;
		return saldo;
	}

	public double saque(double valor) {
		saldo = saldo - valor;
		return saldo;
	}

	public void exibirSaldo() {
		System.out.printf("Olá " + titular + ", o seu saldo é de: R$ %.2f", saldo);
	}

	public double getSaldo() {
		return saldo;
	}

}
