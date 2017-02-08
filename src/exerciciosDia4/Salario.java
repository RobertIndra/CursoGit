package exerciciosDia4;
import java.util.*;

public class Salario {

	private double valorBruto;
	private double descontoINSS;
	private double salarioLiquido;

	public double atribuirValorBruto() {
		return valorBruto;
	}

	public double obterValorBruto(Double valor) {
		this.valorBruto = valor;
		return valorBruto;
	}

	public double calcularINSS() {
		descontoINSS = (valorBruto * 20) / 100;
		return descontoINSS;
	}

	public double obterValorLiquido() {
		salarioLiquido = valorBruto - descontoINSS;
		return salarioLiquido;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getDescontoINSS() {
		return descontoINSS;
	}

	public void setDescontoINSS(double descontoINSS) {
		this.descontoINSS = descontoINSS;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Salario sal = new Salario();
		
		System.out.println("Digite o salário a ser calculado");
		//sal.setValorBruto(s.nextDouble());
		sal.obterValorBruto(s.nextDouble());
		sal.calcularINSS();
		sal.obterValorLiquido();
		
		System.out.printf("Seu salário líquido sera de: R$ %.2f", sal.getSalarioLiquido());
		
		
	}
	
}
