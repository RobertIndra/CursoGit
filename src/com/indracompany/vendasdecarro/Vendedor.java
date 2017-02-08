package com.indracompany.vendasdecarro;

import java.util.ArrayList;

public class Vendedor extends Pessoa implements Autenticavel {

	private int codigoVendedor = 0;
	ArrayList<Vendedor> listVendedores = new ArrayList<Vendedor>();

	// validar login
	public boolean autenticaLogin(String login) {
		for (int i = 0; i < listVendedores.size(); i++) {
			if (login.equals(listVendedores.get(i).getLogin())) {
				System.out.println("Login Aceito");
				return true;
			}
		}
		return false;
	}

	// validar senha
	public boolean autenticaSenha(String senha) {
		for (int i = 0; i < listVendedores.size(); i++) {
			if (senha.equals(listVendedores.get(i).getSenha())) {
				System.out.println("Login Aceito");
				return true;
			}
		}
		return false;
	}

	// metodo para gerar codigo vendedor automaticamente
	public int gerarCodigoVendedor() {
		codigoVendedor++;
		return codigoVendedor;
	}

	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

}
