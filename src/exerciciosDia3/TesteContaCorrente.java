package exerciciosDia3;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.titular = "Robert";
		conta.deposito(5000);
		System.out.println("Saldo: " + conta.getSaldo());
		conta.saque(1000);
		conta.exibirSaldo();

	}

}
