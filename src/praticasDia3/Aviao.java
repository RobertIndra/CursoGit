package praticasDia3;

public class Aviao {

	private String fabricante;
	private String modelo;
	private int limiteDePassageiros;
	private int qtdTripulantes;
	private String anoFabricacao;
	private int velMaxima;

	public Aviao(String fabricante, String modelo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public Aviao(String fabricante, String modelo, int limiteDePessageiros, int qtdTripulantes, int velMaxima) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.limiteDePassageiros = limiteDePessageiros;
		this.qtdTripulantes = qtdTripulantes;
		this.velMaxima = velMaxima;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getLimiteDePassageiros() {
		return limiteDePassageiros;
	}

	public void setLimiteDePassageiros(int limiteDePassageiros) {
		this.limiteDePassageiros = limiteDePassageiros;
	}

	public int getQtdTripulantes() {
		return qtdTripulantes;
	}

	public void setQtdTripulantes(int qtdTripulantes) {
		this.qtdTripulantes = qtdTripulantes;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}

}
