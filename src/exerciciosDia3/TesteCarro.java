package exerciciosDia3;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Cor cor = new Cor();
		carro.modelo = "X1";
		carro.fabricante = "BMW";
		carro.anoFabricação = 2017;
		cor.nome = "Prata";
		cor.corMetalica = true;
		cor.preco = 135.000;
		carro.airBag = true;
		carro.abs = true;
		carro.direcaoHidraulica = true;
		carro.arCondicionado = true;
		
		carro.exibirCondicionais();
		System.out.println(carro);
		System.out.println(cor);
		

	}

}
