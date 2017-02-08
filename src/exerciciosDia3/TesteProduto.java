package exerciciosDia3;


import java.util.*;

public class TesteProduto {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Produto> listProduto = new ArrayList<Produto>();
		Produto prod = null;

		for (int i = 0; i < 3; i++) {
				prod = new Produto();
				System.out.println("Quantidades do produto:");
				prod.setQtdProdutos(s.nextInt());
				System.out.println("Valor do produto");
				prod.setpreco(s.nextDouble());
				System.out.println("Valor do descontos (Em R$)");
				prod.setDescontos(s.nextDouble());
				listProduto.add(prod);
		}
		for (Produto aux : listProduto){
			aux.calcularValor();
		}
		System.out.printf("Valor total a ser pago é de: R$ %.2f", prod.getTotal());
	}

}
