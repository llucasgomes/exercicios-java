package exerciciosPOO;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// OBJETO
				Scanner leitor = new Scanner(System.in);

				// ATRIBUTOS
				String nome;
				int horasTrabalhadas;
				String turno;
				String categoria;
				double salarioMinimo = 450;
				double auxAlim = 0;
				int contador = 1;
								
				System.out.printf("Modo demo, com possilidade de efetuar até 10 verificações \n \n");
				System.out.printf("Matricula: #%2d \n", contador);

				// RECEBIMENTO DE VALORES DO ATRIBUTO NOME
				System.out.printf("Nome do Funcionário: ");
				nome = leitor.nextLine();
				// =============================================================================
				// RECEBIMENTO DE VALORES DO ATRIBUTO TURNO COM REQUESITO "A"
				
				turno = turno(leitor);
				// =============================================================================
				// RECEBIMENTO DE VALORES DO ATRIBUTO CATEGORIA COM REQUESITO "A"

				categoria = categoria(leitor);
				
				// =============================================================================
				// RECEBIMENTO DE VALORES DO ATRIBUTO HORAS TRABALHADAS NO MES COM REQUESITO "A"

				System.out.printf("Quantas horas trabalhada no mês: ");
				horasTrabalhadas = leitor.nextInt();
				
				// =============================================================================
				// PROCESSO VALOR HORA TRABALHADA

				double valorHoraTrabalhada = 0;

				valorHoraTrabalhada = extracted(turno, categoria, salarioMinimo, valorHoraTrabalhada);
				// =============================================================================
				// PROCESSO SALARIO INICIAL

				double salarioInicial = valorHoraTrabalhada + horasTrabalhadas;

				// =============================================================================
				// PROCESSO VALOR DO AUXILIO ALIMENTACAO RECEBIDO PELO FUNCIONARIO

				auxAlim = auxilioAlimentacao(auxAlim, salarioInicial);

				// =============================================================================
				// PROCESSO MOSTRAR NA TELA O RESULTADO

				resultado(nome, horasTrabalhadas, auxAlim, contador, valorHoraTrabalhada, salarioInicial);


				categoria = leitor.next();

				leitor.close();


	}

	private static void resultado(String nome, int horasTrabalhadas, double auxAlim, int contador,
			double valorHoraTrabalhada, double salarioInicial) {
		System.out.printf("============== RESULTADO =============== \n\n");
		System.out.printf(
				"Codigo:#%d \nNome:%s \nHoras Trabalhadas:%d \nValor da hora:R$ %.2f \nSalario Inicial:R$ %.2f \nAuxilio Alimentação: R$ %.2f \n\nSalario Final %.2f",
				contador, nome, horasTrabalhadas, valorHoraTrabalhada, salarioInicial, auxAlim,
				(salarioInicial + auxAlim));
	}

	private static String turno(Scanner leitor) {
		String turno;
		boolean x = true;
		do {

			System.out.printf("Turno (M – matutino; V – vespertino; N – noturno): ");
			turno = leitor.next().toUpperCase();

			if (turno.equals("M") || turno.equals("V") || turno.equals("N")) {

				x = false;
			} else {
				System.out.printf("POW mano... Tá na cara a pergunta.. Vamos de novo... \n \n");
			}

		} while (x);
		return turno;
	}

	private static String categoria(Scanner leitor) {
		String categoria;
		boolean y = true;
		do {
			System.out.printf("categoria (O – operário ou G – gerente): ");
			categoria = leitor.next().toUpperCase();

			if (categoria.equals("O") || categoria.equals("G")) {

				y = false;
			} else {
				System.out.printf("Tá ERRANDO DE MAIS hein!!!.. Vamos DE novo... \n \n");
			}

		} while (y);
		return categoria;
	}

	private static double extracted(String turno, String categoria, double salarioMinimo, double valorHoraTrabalhada) {
		if (categoria.equals("G") && turno.equals("N")) {
			valorHoraTrabalhada = salarioMinimo * 0.18;
		} else if (categoria.equals("G") && (turno.equals("M") || turno.equals("V"))) {
			valorHoraTrabalhada = +salarioMinimo * 0.15;
		} else if (categoria.equals("O") && turno.equals("N")) {
			valorHoraTrabalhada = salarioMinimo * 0.13;
		} else if (categoria.equals("O") && (turno.equals("M") || turno.equals("V"))) {
			valorHoraTrabalhada = salarioMinimo * 0.1;
		}
		return valorHoraTrabalhada;
	}

	private static double auxilioAlimentacao(double auxAlim, double salarioInicial) {
		if (salarioInicial <= 300) {
			auxAlim = salarioInicial * 0.2;
		} else if (salarioInicial > 300 && salarioInicial <= 600) {
			auxAlim = salarioInicial * 0.15;
		} else if (salarioInicial > 600) {
			auxAlim = salarioInicial * 0.05;
		}
		return auxAlim;
	}

}
