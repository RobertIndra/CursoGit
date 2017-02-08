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
	
	// cadastro usuário
	public void cadastrarUsuario() {
		System.out.println("----- Iniciando Cadastro de Usuário -----");
		usuario = new Usuario();
		System.out.println("Insira o nome do usuário");
		usuario.setNome(s.next());
		System.out.println("Insira um número de telefone (somente números)");
		usuario.setTelefone(s.nextInt());
		System.out.println("Insira o número de RG");
		usuario.setRg(s.next());
		System.out.println("Insira o CPF");
		usuario.setCpf(s.next());
		System.out.println("Insira um email válido");
		usuario.setEmail(s.next());
		System.out.println("Insira um login para o usuário");
		usuario.setLogin(s.next());
		System.out.println("Crie uma senha. Você deve memorizar essa senha");
		usuario.setSenha(s.next());
		usuario.gerarCodigoUsuario();
		usuario.listUsuarios.add(usuario);
		System.out.println("Usuário cadastrado com sucesso!!!");
	}

	// cadastro cliente
	public void cadastrarCliente() {
		System.out.println("----- Iniciando Cadastro de Cliente -----");
		cliente = new Cliente();
		System.out.println("Insira o nome do cliente");
		cliente.setNome(s.next());
		System.out.println("Insira um número de telefone (somente números)");
		cliente.setTelefone(s.nextInt());
		System.out.println("Insira o número de RG");
		cliente.setRg(s.next());
		System.out.println("Insira o CPF");
		cliente.setCpf(s.next());
		System.out.println("Insira um email válido");
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
		System.out.println("Insira um número de telefone (somente números)");
		vendedor.setTelefone(s.nextInt());
		System.out.println("Insira o número de RG");
		vendedor.setRg(s.next());
		System.out.println("Insira o CPF");
		vendedor.setCpf(s.next());
		System.out.println("Insira um email válido");
		vendedor.setEmail(s.next());
		System.out.println("Insira um login para o vendedor");
		vendedor.setLogin(s.next());
		System.out.println("Crie uma senha. Você deve memorizar essa senha");
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
		System.out.println("Insira um número de telefone (somente números)");
		gerente.setTelefone(s.nextInt());
		System.out.println("Insira o número de RG");
		gerente.setRg(s.next());
		System.out.println("Insira o CPF");
		gerente.setCpf(s.next());
		System.out.println("Insira um email válido");
		gerente.setEmail(s.next());
		System.out.println("Insira um login para o vendedor");
		gerente.setLogin(s.next());
		System.out.println("Crie uma senha. Você deve memorizar essa senha");
		gerente.setSenha(s.next());
		gerente.gerarCodigoGerente();
		gerente.listGerentes.add(gerente);
		System.out.println("Gerente cadastrado com sucesso!!!");
	}

	// cadastro de carro
	public void cadastrarCarro() {
		System.out.println("----- Iniciando Cadastro de veículo -----");
		carro = new Carro();
		System.out.println("Insira modelo do veículo");
		carro.setModelo(s.next());
		System.out.println("Insira o ano do veículo");
		carro.setAno(s.nextInt());
		System.out.println("Insira o fabricante do veículo");
		carro.setFabricante(s.next());
		System.out.println("Insira a cor do veículo");
		carro.setCor(s.next());
		System.out.println("Insira o valor do veículo");
		carro.setPreco(s.nextDouble());
		carro.gerarCodigoCarro();
		venda.listCarros.add(carro);
		System.out.println("Veículo cadastrado com sucesso!!!");
	}

}
