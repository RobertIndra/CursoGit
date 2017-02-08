package exerciciosDia4;

public class Empregado {

	private String nome;
	private String funcao;
	private double salario;
	
	public Empregado(String nome, String funcao, double salario) {
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}
	 
	public double aumentarSalario(double aumento){
		double salReajustado = salario + aumento;
		salario = salReajustado;
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
