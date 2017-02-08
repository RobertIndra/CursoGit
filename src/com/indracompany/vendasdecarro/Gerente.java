package com.indracompany.vendasdecarro;

import java.util.ArrayList;

public class Gerente extends Pessoa implements Autenticavel {

	private int codigoGerente = 0;
	ArrayList<Gerente> listGerentes = new ArrayList<Gerente>();
	

	// validar login
	public boolean autenticaLogin(String login) {
		for (int i = 0; i < listGerentes.size(); i++) {
			if (login.equals(listGerentes.get(i).getLogin())) {
				return true;
			}
		}
		return false;
	}

	// validar senha
	public boolean autenticaSenha(String senha) {
		for (int i = 0; i < listGerentes.size(); i++) {
			if (senha.equals(listGerentes.get(i).getSenha())) {
				return true;
			}
		}
		return false;
	}

	// metodo para gerar codigo gerente automaticamente
	public int gerarCodigoGerente() {
		codigoGerente++;
		return codigoGerente;
	}

	public int getCodigoGerente() {
		return codigoGerente;
	}

	public void setCodigoGerente(int codigoGerente) {
		this.codigoGerente = codigoGerente;
	}

}
