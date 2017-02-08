package com.indracompany.vendasdecarro;

import java.util.*;

public class RealizarVendas {

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int menuPrincipal;
		int opCadastro;
		double comissaoGerente = 0;
		double comissaoVendedor = 0;
		Cadastros cadastro = new Cadastros();
		ArrayList<Venda> listVendas = new ArrayList<Venda>();

		;
		System.out.println("----- IndraCar Concessionária ----- ");
		// laço do menu de cadastro e vendas
		do {
			// escolher entre a opção de cadastro ou venda
			System.out.println("1 - Realizar Cadastros \n2 - Realizar vendas \n0 - Sair");
			menuPrincipal = s.nextInt();
			switch (menuPrincipal) {
			case 1:
				// laço das opções de cadastro
				do {
					System.out.println("----- Iniciando cadastros -----");
					System.out.println(
							"1 - Cadastrar Usuário \n" + "2 - Cadastrar Cliente \n" + "3 - Cadastrar Vendedor \n"
									+ "4 - Cadastrar Gerente \n" + "5 - Cadastrar Carro \n" + "0 - Sair");
					opCadastro = s.nextInt();
					switch (opCadastro) {
					case 1:
						String op1 = "";
						do {
							// chama o metodo do cadastro
							cadastro.cadastrarUsuario();
							// escolher entre novo cadastro ou sair
							System.out.println("Deseja realizar outro cadastro de usuário? [S/N]");
							op1 = s.next();
						} while (op1.equals("s"));
						break;
					case 2:
						String op2 = "";
						do {
							// chama o metodo do cadastro
							cadastro.cadastrarCliente();
							// escolher entre novo cadastro ou sair
							System.out.println("Deseja realizar outro cadastro de cliente? [S/N]");
							op2 = s.next();
						} while (op2.equals("s"));
						break;
					case 3:
						String op3 = "";
						do {
							// chama o metodo do castro
							cadastro.cadastrarVendedor();
							// escolher entre novo cadastro ou sair
							System.out.println("Deseja realizar outro cadastro de vendedor? [S/N]");
							op3 = s.next();
						} while (op3.equals("s"));
						break;
					case 4:
						String op4 = "";
						do {
							// chama o metodo do cadastro
							cadastro.cadastrarGerente();
							// escolher entre novo cadastro ou sair
							System.out.println("Deseja realizar outro cadastro de Gerente? [S/N]");
							op4 = s.next();
						} while (op4.equals("s"));
						break;
					case 5:
						String op5 = "";
						do {
							// chama o metodo do cadastro
							cadastro.cadastrarCarro();
							// escolher entre novo cadastro ou sair
							System.out.println("Deseja realizar outro cadastro de veículo? [S/N]");
							op5 = s.next();
						} while (op5.equals("s"));
						break;
					case 0:
						System.out.println(" ----- Finalizando -----");
						break;
					default:
						System.out.println("Opção inválida. Escolha entre uma das disponiveis");
						break;
					}
				} while (opCadastro > 0); // fim do case 1 (cadastros)
				break;
			case 2:
				int opPerfil;
				Venda venda = new Venda();
				System.out.println("----- Iniciando vendas -----");
				System.out.println("Necessário realizar login! Qual o seu perfil? \n"
						+ "1 - Gerente \n2 - Vendedor \n3 - Cliente Online (compras pela WEB)");
				opPerfil = s.nextInt();
				if (opPerfil == 1) {
					// validação de login e senha
					System.out.println("Digite seu login");
					if (cadastro.gerente.autenticaLogin(s.next()) == true) {
						System.out.println("Digite sua senha");
						if (cadastro.gerente.autenticaSenha(s.next()) == true) {
							System.out.println("Acesso Permitido");
							venda.realizarVenda();
							venda.setEfetuouVenda("Gererente");
							listVendas.add(venda);
							comissaoGerente = (venda.getValorVenda() * 0.10) + comissaoGerente;
							
						} else {
							System.out.println("Senha incorreta! Acesso Negado");
						}
					} else {
						System.out.println("Login Incorreto! Acesso negado");
					}
				} else if (opPerfil == 2) {
					// validação de login e senha
					System.out.println("Digite seu login");
					if (cadastro.vendedor.autenticaLogin(s.next()) == true) {
						System.out.println("Digite sua senha");
						if (cadastro.vendedor.autenticaSenha(s.next()) == true) {
							System.out.println("Acesso Permitido");
							venda.realizarVenda();
							venda.setEfetuouVenda("Vendedor");
							listVendas.add(venda);
							comissaoVendedor = (venda.getValorVenda() * 0.05) + comissaoVendedor;
							comissaoGerente = (venda.getValorVenda() * 0.10) + comissaoGerente;
							
						} else {
							System.out.println("Senha incorreta! Acesso Negado");
						}
					} else {
						System.out.println("Login Incorreto! Acesso negado");
					}
				} else if (opPerfil == 3) {
					// validação de login e senha
					System.out.println("Digite seu login");
					if (cadastro.usuario.autenticaLogin(s.next()) == true) {
						System.out.println("Digite sua senha");
						if (cadastro.usuario.autenticaSenha(s.next()) == true) {
							System.out.println("Acesso Permitido");
							venda.realizarVenda();
							venda.setEfetuouVenda("Compra realizada por usuário na WEB");
							listVendas.add(venda);
						} else {
							System.out.println("Senha incorreta! Acesso Negado");
						}
					} else {
						System.out.println("Login Incorreto! Acesso negado");
					}
				}
				break;
			case 0:
				System.out.println(" ----- Finalizando -----");
				break;
			default:
				System.out.println("Opção inválida. Escolha entre uma das disponiveis");
				break;
			} // fim do case 2 (vendas)
		} while (menuPrincipal > 0);
		// imprimindo relatórios de venda
		for (Venda aux : listVendas) {
			System.out.println(" ******************* ");
			System.out.println("Imprimindo Relatórios de Vendas");
			System.out.println(" ******************* ");
			System.out.println(aux);
			System.out.println(" ******************* ");
			System.out.println(" ******************* ");
			
			System.out.println("Comissão Gerente" + comissaoGerente);
			System.out.println("Comissão Vendedor" + comissaoVendedor);
			
		}
	}

}
