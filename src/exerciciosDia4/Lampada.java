package exerciciosDia4;

public class Lampada {

	private String cor;
	private boolean ligada;
	
	public Lampada(){
		
	}
	
	public Lampada(String cor, boolean ligada){
		this.cor = cor;
		this.ligada = ligada;
	}
	
	public Lampada(String cor){
		this.cor = cor;
		this.ligada = true;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
}
