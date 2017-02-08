package exerciciosDia3;

import java.util.ArrayList;

public class Produto {

	private int qtdProdutos;
	private double preco;
	private double descontos;
	public double total;
	
	
	public double calcularValor(){
		double valorInicial = this.qtdProdutos * this.preco;
		total = valorInicial - this.descontos;
		return total;	
	}
	public int getQtdProdutos() {
		return qtdProdutos;
	}

	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}

	public double getpreco() {
		return preco;
	}

	public void setpreco(double preco) {
		this.preco = preco;
	}

	public double getDescontos() {
		return descontos;
	}

	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
