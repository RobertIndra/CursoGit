package com.indracompany.vendasdecarro;

import java.util.*;

public class Venda {

	private int codigoVenda = 0;
	private double valorVenda;
	private String formaPagamento;
	private int qtdParcelas;
	private double totalParcelas;
	private double descontos;
	private int data;
	private int horas;
	private String efetuouVenda;
	Cliente cliente;
	Carro carro;
	ArrayList<Carro> listCarros = new ArrayList<Carro>();
	ArrayList<Cliente> listClientes = new ArrayList<Cliente>();
	
	
	Scanner s = new Scanner(System.in);

	public void realizarVenda() {
		System.out.println(" ----- Realizando a Venda ----- ");
		gerarCodigoVenda();
		System.out.println("Digite código do cliente");
		// verificar se o cliente tem cadastro
		for (int c = 0; c < listClientes.size(); c++) {
			if (s.nextInt() == listClientes.get(c).getCodigoCliente()) {
				this.cliente = listClientes.get(c);
			} else {
				System.out.println("Cliente não Cadastrado");
			}
		}																		
		System.out.println("Digite o código do veículo");
		// verificar se carro esta cadastrado e pegar o valor
		for (int i = 0; i < listCarros.size(); i++) {
			if (s.nextInt() == listCarros.get(i).getCodigoCarro()) {
				valorVenda = listCarros.get(i).getPreco();
				this.carro = listCarros.get(i);
			} else {
				System.out.println("Veículo não encontrado ou indisponivel");
			}
		}
		System.out.println(
				"Qual a forma de pagamento: (A vista (Boleto em caso de compra pela WEB) ou Crediário da loja");
		formaPagamento = s.next().trim();
		System.out.println("Quantidade de parcelas ");
		qtdParcelas = s.nextInt();
		// se o valor for a vista (ou 1 parcela) aplicar desconto de 20%
		if (getQtdParcelas() <= 1) {
			descontos = valorVenda * 0.2;
			valorVenda = valorVenda - descontos;
			totalParcelas = valorVenda;
		} else {
			// mostrar o valor de cada parcela
			totalParcelas = valorVenda / qtdParcelas;
		}
		data = Calendar.DATE; // pegar data do sitema
		horas = Calendar.HOUR; // pegar horas do sistema
	}

	// metodo para gerar codigo da venda automaticamente
	public int gerarCodigoVenda() {
		codigoVenda++;
		return codigoVenda;
	}

	public int getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	public double getDescontos() {
		return descontos;
	}

	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}

	public double getTotalParcelas() {
		return totalParcelas;
	}

	public void setTotalParcelas(double totalParcelas) {
		this.totalParcelas = totalParcelas;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getEfetuouVenda() {
		return efetuouVenda;
	}

	public void setEfetuouVenda(String efetuouVenda) {
		this.efetuouVenda = efetuouVenda;
	}

	@Override
	public String toString() {
		return "Código  da Venda = " + codigoVenda + ",\n Valor Total Venda = " + valorVenda
				+ ",\n Forma de Pagamento = " + formaPagamento + ",\n Quantidade de Parcelas = " + qtdParcelas
				+ ",\n Total da Parcela = " + totalParcelas + ",\n Data da compra = " + data + ",\n Horas  da Compra = "
				+ horas + ",\n Carro = " + carro + ",\n Nome do Cliente " + cliente.getNome() + "Telefone do cliente = "
				+ cliente.getTelefone() + ",\n Venda Efetuada através = " + efetuouVenda;
	}

}
