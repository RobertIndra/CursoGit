package exerciciosDia4;

import java.util.ArrayList;

public class TimeDeFutebol {

	private Jogador jogador;
	private double mediaIdade;
	private ArrayList<Jogador> listJogadores = new ArrayList<Jogador>();
	

	double idades = 0;
	public double calcularMediaIdade(int idade) {
		idades = (idades + idade) / 11;
		mediaIdade = idades;
		return mediaIdade;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public double getMediaIdade() {
		return mediaIdade;
	}

	public void setMediaIdade(double mediaIdade) {
		this.mediaIdade = mediaIdade;
	}

	public ArrayList<Jogador> getListJogadores() {
		return listJogadores;
	}
	
	public void setListJogadores(ArrayList<Jogador> listJogadores) {
		this.listJogadores = listJogadores;
	}


}
