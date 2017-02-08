package exerciciosDia4;

import java.util.*;

public class Pagamento {

	public static void main(String[] args) {

		double desc = 0;
		double totalPagamento = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Valor do produto");
		double preco = s.nextDouble();

		System.out.println("Escolha a forma de pagamentos:" + " 1 - A vista em dinheiro ou cheque"
				+ " 2 - A vista no cartão de crédito" + " 3 - Parcelamento em 2 vezes"
				+ " 4 - Parcelamento em 3 vezes");
		int op = s.nextInt();
		switch (op) {
		case 1:
			desc = preco * 0.1;
			totalPagamento = preco - desc;
			System.out.printf("Valor a ser pagao: R$ %.2f", totalPagamento);
			break;
		case 2:
			desc = preco * 0.05;
			totalPagamento = preco - desc;
			System.out.printf("Valor a ser pagao: R$ %.2f", totalPagamento);
			break;
		case 3:
			totalPagamento = preco / 2;
			System.out.printf("A forma de pagamento sera dividido em 2 vezes de R$ %.2f", totalPagamento);
			break;
		case 4:
			double aumento = preco * 0.1;
			totalPagamento = aumento / 3;
			System.out.printf("A forma de pagamento sera dividido em 3 vezes de R$ %.2f", totalPagamento);
			break;
		default:
			System.out.println("Opção inválida");
		}

	}
}
