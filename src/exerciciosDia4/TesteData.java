package exerciciosDia4;

public class TesteData {

	public static void main(String[] args) {
		
		Data dt = new Data(25, 03, 1993);
		dt.validarDia();
		dt.validarMes();
		dt.validaAno();
		dt.retornarDataString();
	}

}
