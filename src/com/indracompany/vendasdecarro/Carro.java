package com.indracompany.vendasdecarro;

import java.util.ArrayList;

public class Carro {

	private String modelo;
	private int ano;
	private String fabricante;
	private String cor;
	private double preco;
	private int codigoCarro = 0;
	
	// metodo para gerar codigo vendedor automaticamente
	public int gerarCodigoCarro() {
		codigoCarro++;
		return codigoCarro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigoCarro() {
		return codigoCarro;
	}

	public void setCodigoCarro(int codigoCarro) {
		this.codigoCarro = codigoCarro;
	}

}
