package exerciciosDia4;

public class Jogador {

	private int idade;
	private double peso;
	private double altura;
	private int idadeMenor18;
	private double mediaAlturas;
	private double porcentagem;
	private TimeDeFutebol times;

	public int obterIdadeMenor18() {
		idadeMenor18++;
		return idadeMenor18;
	}

	double mediaParcial = 0;

	public double calcularMediaAlturas(double altura) {
		mediaParcial = mediaParcial + altura;
		mediaAlturas = mediaParcial / 55;
		return mediaAlturas;
	}

	int count = 0;

	public double calcularPorcentagemDePeso(double peso) {
		if (peso > 80) {
			count++;
		}
		porcentagem = (count * 100) / 55;
		return porcentagem;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdadeMenor18() {
		return idadeMenor18;
	}

	public void setIdadeMenor18(int idadeMenor18) {
		this.idadeMenor18 = idadeMenor18;
	}

	public double getMediaAlturas() {
		return mediaAlturas;
	}

	public void setMediaAlturas(double mediaAlturas) {
		this.mediaAlturas = mediaAlturas;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public TimeDeFutebol getTimes() {
		return times;
	}

	public void setTimes(TimeDeFutebol times) {
		this.times = times;
	}

}
