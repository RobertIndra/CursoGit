package exerciciosDia4;

import java.util.*;

public class TesteCandidato {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Candidato> listCandidatos = new ArrayList<Candidato>();
		Candidato cand = new Candidato();
		int contM = 0;
		int contF = 0;
		cand.setIdade(0);

		while (cand.getIdade() == 0) {
			System.out.println("Iniciando cadastro de listCandidatos...");
			System.out.println("Idade do candidato");
			cand.setIdade(s.nextInt());
			System.out.println("Sexo do Candidato (S/N)");
			cand.setSexo(s.next());
			if (cand.getSexo().equals("m")) {
				contM++;
			} else {
				contF++;
			}
			System.out.println("Já possui experiência? (S/N)");
			cand.setExperiencia(s.next());
			listCandidatos.add(cand);
		}
		for (int i = 0; i < listCandidatos.size(); i++) {
			cand.calcularMediaIdade_ComExperienciaH(listCandidatos.get(i).getIdade(),
					listCandidatos.get(i).getExperiencia(), listCandidatos.get(i).getSexo());
			
		}
	}

}
