package exerciciosDia1;

import java.util.*;

public class Exercicio4 {
	/*
	 * 4. Escreva um programa que pergunte o dia, mês e ano do aniversário de
	 * uma pessoa e diga se a data é válida ou não. Caso não seja, diga o
	 * motivo. Suponha que todos os meses tem 31 dias e que estejamos no ano de
	 * 2017.
	 */

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		boolean d = false;
		boolean m = false;
		boolean a = false;
		int idade = 0;
		
		try {
			System.out.println("Digite o dia do seu aniversário com 2 digitos ");
			int dia = n.nextInt();
			System.out.println("Digite o mês de nascimento com 2 digitos ");
			int mes = n.nextInt();
			System.out.println("Digite o ano de nascimento com 4 digitos ");
			int ano = n.nextInt();
			
			if (dia > 0 && dia <= 31) {
				
				d = true;
			} else {
				
				System.out.println("Dia inválido. Digite o dia entre 01 e 31");
			}
			if (mes > 0 && mes <= 12) {
				
				m = true;
			} else {
				
				System.out.println("Mês inválido. digite o mês entre 01 e 12");
			}
			if (ano > 0 && ano <= 2017) {
				
				a = true;
			} else {
				
				System.out.println("Ano inválido. Digite um ano até o ano atual");
			}
			if (d == true && m == true && a == true) {
				
				idade = 2017 - ano;
			}
			
			System.out.println("Data de aniversário: " + dia + "/" + mes + "/" + ano);
			System.out.println("Voçê tem " + idade + " anos");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
