package exerciciosDia3;

public class Carro {
	
	public String modelo;
	public String fabricante;
	public int anoFabricação;
	public Cor cor;
	public boolean airBag;
	public boolean abs;
	public boolean direcaoHidraulica;
	public boolean arCondicionado;
	
	public void exibirCondicionais() {
		System.out.println("Possui arbaig? " + airBag + " Possui ABS? " + abs + " Possui Direção Hidraulica? " 
							+ direcaoHidraulica + " Possui Ar Condicionado? " + arCondicionado);
	}

	@Override
	public String toString() {
		return "Carro Modelo = " + modelo + ", Fabricante = " + fabricante + ", Ano Fabricação = " + anoFabricação;
	}
	
	
}
