package exerciciosIF;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("===== BONIFICAÇÃO DE NATAL =====");
		String nomeFuncionario;
		int horasExtras,horasFaltas,horasMinutos;
		
		System.out.print("Insira o nome do funcionario: ");
		nomeFuncionario = leitor.next();
		System.out.print("Insira a quantidade de horas Extras: ");
		horasExtras = leitor.nextInt();
		System.out.print("Insira quantidade de horas de Falta: ");
		horasFaltas = leitor.nextInt();
		System.out.print("");
		
		
		
		horasMinutos = horasExtras - (2 / 3* horasFaltas);
		
		if (horasMinutos >= 2401) {
			System.out.print("O Sr(a) " + nomeFuncionario + " irá receber uma bonificação de R$ 500,00");
		} else if (horasMinutos >= 1801 && horasMinutos < 2400)  {
			System.out.print("O Sr(a) " + nomeFuncionario + " irá receber uma bonificação de R$ 400,00");
		} else if (horasMinutos >= 1201 && horasMinutos <= 1800)  {
			System.out.print("O Sr(a) " + nomeFuncionario + " irá receber uma bonificação de R$ 300,00");
		}else if (horasMinutos >= 600 && horasMinutos <= 1200)  {
			System.out.print("O Sr(a) " + nomeFuncionario + " irá receber uma bonificação de R$ 200,00");
		}else  {
			System.out.print("O Sr(a) " + nomeFuncionario + " irá receber uma bonificação de R$ 100,00");
		}
		
		leitor.close();

	}

}
