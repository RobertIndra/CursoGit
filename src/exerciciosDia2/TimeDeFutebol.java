package exerciciosDia2;

import java.text.DecimalFormat;
import java.util.*;

/*
 * Em um campeonato de futebol existem 5 times de futebol e cada um possui 11 jogadores.
 * Faça um programa que receba que receba a idade, o peso e a altura de cada um dos jopgadores, mostre e calcule e mostre:
 *  - a quantidade de jogadores com idade inferior a 18 anos
 *  - a media das idades dos jogadores de cada time
 *  - a media das alturas de todos os jogadores do campeonato
 *  - a porcentagem de jogadores com mais de 80 quilos entre todos jogadores do campeonato.
 */
public class TimeDeFutebol {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		int idadeTime1[] = new int[11];
		int idadeTime2[] = new int[11];
		int idadeTime3[] = new int[11];
		int idadeTime4[] = new int[11];
		int idadeTime5[] = new int[11];
		int countIdadeMenores = 0;
		double pesoJogadores[] = new double[55];
		double alturaJogadores[] = new double[55];
		double mediaFinal1 = 0;
		double mediaFinal2 = 0;
		double mediaFinal3 = 0;
		double mediaFinal4 = 0;
		double mediaFinal5 = 0;
		double mediaFinalAlt = 0;
		double porcentagem = 0;

		try {
			System.out.println("Iniciando cadastro de jogadores...");

			for (int a = 1; a <= 5; a++) {
				System.out.println("Insira idade jogadores time " + a);
				for (int i = 0; i < 11; i++) {
					int idade = s.nextInt();
					// laço para poupular array dos times
					if (a == 1) {
						idadeTime1[i] = idade;
					} else if (a == 2) {
						idadeTime2[i] = idade;
					} else if (a == 3) {
						idadeTime3[i] = idade;
					} else if (a == 4) {
						idadeTime4[i] = idade;
					} else if (a == 5) {
						idadeTime5[i] = idade;
					}
					// laço para separar idades menores que 18
					if (idade < 18) {
						countIdadeMenores++;
					}
				}
				System.out.println("Insira peso jogadores time " + a);
				for (int i = 0; i < 11; i++) {
					double peso = s.nextDouble();
					pesoJogadores[i] = peso;
				}
				System.out.println("Insira altura jogadores time " + a);
				for (int i = 0; i < 11; i++) {
					double altura = s.nextDouble();
					alturaJogadores[i] = altura;
				}
			}
			double media1 = 0;
			for (int aux : idadeTime1) {
				media1 = media1 + aux;
				mediaFinal1 = media1 / 3;
			}
			double media2 = 0;
			for (int aux : idadeTime2) {
				media2 = media2 + aux;
				mediaFinal2 = media2 / 3;
			}
			double media3 = 0;
			for (int aux : idadeTime3) {
				media3 = media3 + aux;
				mediaFinal3 = media3 / 3;
			}
			double media4 = 0;
			for (int aux : idadeTime4) {
				media4 = media4 + aux;
				mediaFinal4 = media4 / 3;
			}
			double media5 = 0;
			for (int aux : idadeTime5) {
				media5 = media5 + aux;
				mediaFinal5 = media5 / 3;
			}
			double mediaAltura = 0;
			for (double aux2 : alturaJogadores) {
				mediaAltura = mediaAltura + aux2;
				mediaFinalAlt = mediaAltura / 15;
				// double auxAltura = Double.valueOf(df.format(mediaFinalAlt));
			}
			int count = 0;
			for (double aux3 : pesoJogadores) {

				if (aux3 > 80) {
					count++;
				}
				porcentagem = (count * 100) / 55;
			}
			System.out.println("Quantidade de jogadores com menos de 18 anos: " + countIdadeMenores);
			System.out.printf("Media de idades dos jogadores Time 1: %.2f\n", mediaFinal1);
			System.out.printf("Media de idades dos jogadores Time 2: %.2f\n", mediaFinal2);
			System.out.printf("Media de idades dos jogadores Time 3: %.2f\n", mediaFinal3);
			System.out.printf("Media de idades dos jogadores Time 4: %.2f\n", mediaFinal4);
			System.out.printf("Media de idades dos jogadores Time 5: %.2f\n", mediaFinal5);
			System.out.printf("Media da altura dos jogadores do campeonato: %.2f\n", mediaFinalAlt);
			System.out.printf("Porcentagem de jogadores com mais de 80 kg: %.2f", porcentagem);
			System.out.println("%");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
