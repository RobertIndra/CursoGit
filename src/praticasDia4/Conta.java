package praticasDia4;

public class Conta {

	protected int agencia;
	protected int numero;
	protected double saldo;

	public double deposita(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		} else {
			System.out.println("Impossivel depositar valores menores que 0");
		}
		return saldo;
	}

	public double saca(double valor) {
		if (valor > 0 || valor < saldo) {
			saldo = saldo - valor;
		} else {
			System.out.println("Você não possui saldo disponivel para efetuar a operação");
		}

		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static void main(String args[]) {

		Conta cp = new ContaPoupanca();
		Conta cc = new ContaCorrente();
		
		cp.setAgencia(10456);
		cp.setNumero(123);
		cp.deposita(40000);
		cp.saca(30000);
		
		cc.setAgencia(10658);
		cc.setNumero(321);
		cc.deposita(2000);
		cc.saca(1500);
		
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
		
	}
		
}
