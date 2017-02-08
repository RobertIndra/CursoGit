package exerciciosDia4;

import java.util.*;

public class TesteCampeonato {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<TimeDeFutebol> listTimes = new ArrayList<TimeDeFutebol>();
		ArrayList<Jogador> listJogadores = new ArrayList<Jogador>();
		TimeDeFutebol time = null;
		Jogador jogador = null;
		// time
		for (int i = 0; i < 5; i++) {
			time = new TimeDeFutebol();
			// jogadores
			for (int j = 0; j < 11; j++) {
				jogador = new Jogador();
				System.out.println("Digite a idade do jogador");
				jogador.setIdade(s.nextInt());
				if (jogador.getIdade() < 18) {
					jogador.obterIdadeMenor18();
				}
				System.out.println("Digite o peso do jogador");
				jogador.setPeso(s.nextDouble());
				System.out.println("Digite a altura do jagador");
				jogador.setAltura(s.nextDouble());
				listJogadores.add(jogador);
				time.setListJogadores(listJogadores);
			}
			listTimes.add(time);
		}
		for (TimeDeFutebol t : listTimes) {
			int cont = 0;
			for (int i = 0; i < listJogadores.size(); i++) {
				time.calcularMediaIdade(listJogadores.get(i).getIdade());
			}
			System.out.printf("A média de idade do time " + (cont + 1) + " é %.2f", time.getMediaIdade());
			cont++;
		}
		for (int j = 0; j < listJogadores.size(); j++) {
			jogador.calcularMediaAlturas(listJogadores.get(j).getAltura());
			jogador.calcularPorcentagemDePeso(listJogadores.get(j).getPeso());
		}
		System.out.println("\nA quantidade de jogadores com menos de 18 anos no campeonato é de: " + jogador.getIdadeMenor18());
		System.out.printf("A média de altura dos jogadores do campeonato é de %.2f", jogador.getMediaAlturas());
		System.out.printf("\nA porcentagem de jogadores com peso maior que 80 kg é de %.2f", jogador.getPorcentagem());
		System.out.printf("%");
	}

}
