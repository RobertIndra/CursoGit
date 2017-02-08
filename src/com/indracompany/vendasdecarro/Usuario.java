package com.indracompany.vendasdecarro;

import java.util.ArrayList;

public class Usuario extends Pessoa implements Autenticavel {

	private int codigoUsuario = 0;
	ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();

	// validar login
	public boolean autenticaLogin(String login) {
		for (int i = 0; i < listUsuarios.size(); i++) {
			if (login.equals(listUsuarios.get(i).getLogin())) {
				return true;
			}
		}
		return false;
	}

	// validar senha
	public boolean autenticaSenha(String senha) {
		for (int i = 0; i < listUsuarios.size(); i++) {
			if (senha.equals(listUsuarios.get(i).getSenha())) {
				return true;
			}
		}
		return false;
	}

	// metodo para gerar codigo usuario automaticamente
	public int gerarCodigoUsuario() {
		codigoUsuario++;
		return codigoUsuario;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

}
