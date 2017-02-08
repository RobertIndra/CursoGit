package com.indracompany.vendasdecarro;

import java.util.*;

public class Cadastros {

	Scanner s = new Scanner(System.in);
	Usuario usuario = null;
	Cliente cliente = null;
	Vendedor vendedor = null;
	Gerente gerente = null;
	Carro carro = null;
	Venda venda = new Venda();
	
	// cadastro usu�rio
	public void cadastrarUsuario() {
		System.out.println("----- Iniciando Cadastro de Usu�rio -----");
		usuario = new Usuario();
		System.out.println("Insira o nome do usu�rio");
		usuario.setNome(s.next());
		System.out.println("Insira um n�mero de telefone (somente n�meros)");
		usuario.setTelefone(s.nextInt());
		System.out.println("Insira o n�mero de RG");
		usuario.setRg(s.next());
		System.out.println("Insira o CPF");
		usuario.setCpf(s.next());
		System.out.println("Insira um email v�lido");
		usuario.setEmail(s.next());
		System.out.println("Insira um login para o usu�rio");
		usuario.setLogin(s.next());
		System.out.println("Crie uma senha. Voc� deve memorizar essa senha");
		usuario.setSenha(s.next());
		usuario.gerarCodigoUsuario();
		usuario.listUsuarios.add(usuario);
		System.out.println("Usu�rio cadastrado com sucesso!!!");
	}

	// cadastro cliente
	public void cadastrarCliente() {
		System.out.println("----- Iniciando Cadastro de Cliente -----");
		cliente = new Cliente();
		System.out.println("Insira o nome do cliente");
		cliente.setNome(s.next());
		System.out.println("Insira um n�mero de telefone (somente n�meros)");
		cliente.setTelefone(s.nextInt());
		System.out.println("Insira o n�mero de RG");
		cliente.setRg(s.next());
		System.out.println("Insira o CPF");
		cliente.setCpf(s.next());
		System.out.println("Insira um email v�lido");
		cliente.setEmail(s.next());
		cliente.gerarCodigoCliente();
		venda.listClientes.add(cliente);
		System.out.println("Cliente cadastrado com sucesso!!!");
	}

	// cadastro vendedor
	public void cadastrarVendedor() {
		System.out.println("----- Iniciando Cadastro de Vendedor -----");
		vendedor = new Vendedor();
		System.out.println("Insira o nome do Vendedor");
		vendedor.setNome(s.next());
		System.out.println("Insira um n�mero de telefone (somente n�meros)");
		vendedor.setTelefone(s.nextInt());
		System.out.println("Insira o n�mero de RG");
		vendedor.setRg(s.next());
		System.out.println("Insira o CPF");
		vendedor.setCpf(s.next());
		System.out.println("Insira um email v�lido");
		vendedor.setEmail(s.next());
		System.out.println("Insira um login para o vendedor");
		vendedor.setLogin(s.next());
		System.out.println("Crie uma senha. Voc� deve memorizar essa senha");
		vendedor.setSenha(s.next());
		vendedor.gerarCodigoVendedor();
		vendedor.listVendedores.add(vendedor);
		System.out.println("Vendedor cadastrado com sucesso!!!");
	}

	// cadastro gerente
	public void cadastrarGerente() {
		System.out.println("----- Iniciando Cadastro de Gerente -----");
		gerente = new Gerente();
		System.out.println("Insira o nome do Gerente");
		gerente.setNome(s.next());
		System.out.println("Insira um n�mero de telefone (somente n�meros)");
		gerente.setTelefone(s.nextInt());
		System.out.println("Insira o n�mero de RG");
		gerente.setRg(s.next());
		System.out.println("Insira o CPF");
		gerente.setCpf(s.next());
		System.out.println("Insira um email v�lido");
		gerente.setEmail(s.next());
		System.out.println("Insira um login para o vendedor");
		gerente.setLogin(s.next());
		System.out.println("Crie uma senha. Voc� deve memorizar essa senha");
		gerente.setSenha(s.next());
		gerente.gerarCodigoGerente();
		gerente.listGerentes.add(gerente);
		System.out.println("Gerente cadastrado com sucesso!!!");
	}

	// cadastro de carro
	public void cadastrarCarro() {
		System.out.println("----- Iniciando Cadastro de ve�culo -----");
		carro = new Carro();
		System.out.println("Insira modelo do ve�culo");
		carro.setModelo(s.next());
		System.out.println("Insira o ano do ve�culo");
		carro.setAno(s.nextInt());
		System.out.println("Insira o fabricante do ve�culo");
		carro.setFabricante(s.next());
		System.out.println("Insira a cor do ve�culo");
		carro.setCor(s.next());
		System.out.println("Insira o valor do ve�culo");
		carro.setPreco(s.nextDouble());
		carro.gerarCodigoCarro();
		venda.listCarros.add(carro);
		System.out.println("Ve�culo cadastrado com sucesso!!!");
	}

}
