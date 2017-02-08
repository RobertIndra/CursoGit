package com.indracompany.vendasdecarro;

import java.util.ArrayList;

public class Cliente extends Pessoa {

	private int codigoCliente = 0;
	
	

	// metodo para gerar codigo cliente automaticamente
	public int gerarCodigoCliente() {
		codigoCliente++;
		return codigoCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

}
