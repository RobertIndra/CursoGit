package exerciciosDia4;

public class Calculadora {

	private int entrada1;
	private int entrada2;
	private int totalSoma;
	private int totalSubtracao;

	public int somar() {
		totalSoma = entrada1 + entrada2;
		return totalSoma;
	}

	public int subtrair() {
		totalSubtracao = entrada1 - entrada2;
		return totalSubtracao;
	}

	public int getEntrada1() {
		return entrada1;
	}

	public void setEntrada1(int entrada1) {
		this.entrada1 = entrada1;
	}

	public int getEntrada2() {
		return entrada2;
	}

	public void setEntrada2(int entrada2) {
		this.entrada2 = entrada2;
	}

	public int getTotalSoma() {
		return totalSoma;
	}

	public void setTotalSoma(int totalSoma) {
		this.totalSoma = totalSoma;
	}

	public int getTotalSubtracao() {
		return totalSubtracao;
	}

	public void setTotalSubtracao(int totalSubtracao) {
		this.totalSubtracao = totalSubtracao;
	}
	
	
}	

	