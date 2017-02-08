package praticasDia3;

public class Carro {

	private String marca;
	private int modelo;
	private String cor;
	private int qtdLugares;
	private int velMaxima;
	private String direcao;


	public static void ligar() {

		System.out.println("Carro ligando...");
	}

	public static void acelerar() {

		System.out.println("Carro acelerando...");
	}

	public static void frear() {

		System.out.println("Carro freiando...");
	}

	public static void virar(String direcao) {

		System.out.println("Carro virando para " + direcao + " ...");
	}

	public static void estacionar() {

		System.out.println("Carro estacionando...");
	}

	public static void parar() {

		System.out.println("Carro parando...");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdLugares() {
		return qtdLugares;
	}

	public void setQtdLugares(int qtdLugares) {
		this.qtdLugares = qtdLugares;
	}

	public int getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	@Override
	public String toString() {
		return "Carro: Marca = " + marca + ", Modelo = " + modelo + ", Cor = " + cor + ", Quantidade de Lugares = " + qtdLugares
				+ ", Velocidade Máxima = " + velMaxima;
	}
	
	

}
