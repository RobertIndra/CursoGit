package exerciciosDia4;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada lamp1 = new Lampada();
		lamp1.setCor("Branca");
		lamp1.setLigada(false);
		Lampada lamp2 = new Lampada("Azul");
		Lampada lamp3 = new Lampada("Verde", true);

		System.out.println("A lamapada 1 esta ligada? " + lamp1.isLigada() + " e a sua cor é " + lamp1.getCor());
		System.out.println("A lamapada 2 esta ligada? " + lamp2.isLigada() + " e a sua cor é " + lamp2.getCor());
		System.out.println("A lamapada 3 esta ligada? " + lamp3.isLigada() + " e a sua cor é " + lamp3.getCor());
	}
}
