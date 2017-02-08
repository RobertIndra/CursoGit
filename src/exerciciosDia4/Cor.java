package exerciciosDia4;

public class Cor {

	private int red;
	private int green;
	private int blue;

	public Cor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public Cor(int red, int green) {
		this.red = red;
		this.green = green;
	}

	public Cor(int red) {
		this.red = red;
	}

	public Cor() {

	}
	
	public void obterCor() {
		System.out.println("Red: " + red + " Green: " + green + " Blue: " + blue);
	}
	
	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	//teste
	public static void main(String[] args) {
		
		Cor c1 = new Cor(10, 100, 20);
		c1.obterCor();
		Cor c2 = new Cor(125, 30);
		c2.setBlue(7);
		c2.obterCor();
		Cor c3 = new Cor(50);
		c3.setGreen(25);
		c3.setBlue(43);
		c3.obterCor();
		Cor c4 = new Cor();
		c4.setRed(1);
		c4.setGreen(2);
		c4.setBlue(3);
		c4.obterCor();
		
	}
}
