package exerciciosDia4;

public class Hora {

	private int horas;
	private int minutos;
	private int segundos;

	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public void obterhoras() {
		if (horas >= 0 && horas < 25) {
			if (minutos >= 0 && minutos < 59) {
				if (segundos >= 0 && segundos < 59) {
					System.out.println(horas + ":" + minutos + ":" + segundos + " - " + horas + " horas, " + minutos
							+ " minutos, " + segundos + " segundos -");
				} else {
					System.out.println("Segundos inválidos");
				}
			} else {
				System.out.println("Minutos inválidos");
			}
		} else {
			System.out.println("Horas inválidas");
		}
	}
}
