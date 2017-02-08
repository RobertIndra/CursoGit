package exerciciosDia3;

public class Cor {

	public String nome;
	public boolean corMetalica;
	public double preco;
	
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Cor Nome = " + nome + ", Cor Metalica = " + corMetalica + ", Preco = " + preco;
	}

	
}
