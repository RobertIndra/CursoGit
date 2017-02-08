package exerciciosDia4;

import java.util.Calendar;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data() {
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void retornarDataString() {
		String d;
		String m;
		String a;
		if (dia > 0 && dia <= 9) {
			d = "0" + dia;
		} else {
			d = String.valueOf(dia);
		}
		if (mes > 0 && mes <= 9) {
			m = "0" + mes;
		} else {
			m = String.valueOf(mes);
		}
		if (ano > 0 && ano < 10) {
			a = "000" + ano;
		} else if (ano > 9 && ano < 100) {
			a = "00" + ano;
		} else if (ano > 99 && ano < 1000) {
			a = "0" + ano;
		} else {
			a = String.valueOf(ano);
		}
		System.out.println(d + "/" + m + "/" + a);
	}

	public void validarDia() {
		if (dia > 0 && dia <= 31) {
			System.out.println("Dia válido");
		} else {
			this.dia = 1;
			System.out.println("Dia inválido");
		}
	}

	public void validarMes() {
		if (mes > 0 && mes <= 12) {
			System.out.println("Mês válido");
		} else {
			this.mes = 1;
			System.out.println("Mes inválido");
		}
	}

	public void validaAno() {
		if (ano > 0 && ano < 10000) {
			System.out.println("Ano válido");
		} else {
			this.ano = Calendar.YEAR;
			System.out.println("Ano inválido");
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
