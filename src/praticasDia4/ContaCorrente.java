package praticasDia4;

public class ContaCorrente extends Conta implements Autenticavel {

	public double limite = 4000;
	private final int senha = 2017;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}

	double saldoCorrente;

	public double getSaldo() {
		saldoCorrente = saldo + limite;
		return saldoCorrente;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public static void main(String args[]) {
		ContaCorrente cc = new ContaCorrente();

		cc.setAgencia(5698);
		cc.setNumero(689);
		if (cc.autentica(2017) == true) {
			cc.deposita(1300);
			cc.saca(700);
			System.out.println(cc.getSaldo());
		}
		
	}

}
