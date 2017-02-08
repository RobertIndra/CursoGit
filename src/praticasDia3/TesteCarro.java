package praticasDia3;

import java.io.IOException;
import java.util.Scanner;

public class TesteCarro {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		Carro carro = new Carro();
		System.out.println("Qual a marca do carro?");
		carro.setMarca(s.next());
		System.out.println("Qual o modelo do carro?");
		carro.setModelo(s.nextInt());
		System.out.println("Qual a cor do carro?");
		carro.setCor(s.next());
		System.out.println("Qual a quantidade de lugares do carro?");
		carro.setQtdLugares(s.nextInt());
		System.out.println("Qual a velocidademáxima do carro?");
		carro.setVelMaxima(s.nextInt());

		System.out.println(carro);

		System.out.println("Deseja ligar o carro? S/N");
		String aux = s.next();
		if (aux.equals("s")) {
			Carro.ligar();
		}
		aux = "";
		
		System.out.println("Deseja acelera o carro? S/N");
		aux = s.next();
		if (aux.equals("s")) {
			Carro.acelerar();
		}
		aux = "";
		
		System.out.println("Deseja freiar o carro? S/N");
		aux = s.next();
		if (aux.equals("s")) {
			Carro.frear();
		}
		aux = "";
		
		System.out.println("Deseja virar o carro? S/N");
		aux = s.next();
		if (aux.equals("s")) {
			System.out.println("Qual a direção: direita ou esquerda");
			String dir = s.next();
			Carro.virar(dir);
		}
		aux = "";
		
		System.out.println("Deseja estacionar o carro? S/N");
		aux = s.next();
		if (aux.equals("s")) {
			Carro.estacionar();
		}
		aux = "";

		System.out.println("Deseja freiar o parar? S/N");
		aux = s.next();
		if (aux.equals("s")) {
			Carro.parar();
		}
		aux = "";
	}
}
