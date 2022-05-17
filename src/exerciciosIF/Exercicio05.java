package exerciciosIF;

import java.util.Scanner;

//a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informações
//dos turnos e nem categorias inexistentes. Trabalhe sempre com a digitação de letras maiúsculas;
//
//b) Calcule o valor da hora trabalhada, conforme a tabela 1. Adote o valor de R$450,00 para o salário mínimo; 
//
//c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas trabalhadas; 
//
//d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme 
//a tabela 2; 
//
//e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio alimentação 
//e salário final (salário inicial + auxílio alimentação).

public class Exercicio05 {

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
		boolean x = true;
		boolean y = true;

		System.out.printf("Modo demo, com possilidade de efetuar até 10 verificações \n \n");
		System.out.printf("Matricula: #%2d \n", contador);

		// RECEBIMENTO DE VALORES DO ATRIBUTO NOME
		System.out.printf("Nome do Funcionário: ");
		nome = leitor.nextLine();
		// =============================================================================
		// RECEBIMENTO DE VALORES DO ATRIBUTO TURNO COM REQUESITO "A"
		do {

			System.out.printf("Turno (M – matutino; V – vespertino; N – noturno): ");
			turno = leitor.next().toUpperCase();

			if (turno.equals("M") || turno.equals("V") || turno.equals("N")) {

				x = false;
			} else {
				System.out.printf("POW mano... Tá na cara a pergunta.. Vamos de novo... \n \n");
			}

		} while (x);
		// =============================================================================
		// RECEBIMENTO DE VALORES DO ATRIBUTO CATEGORIA COM REQUESITO "A"

		do {
			System.out.printf("categoria (O – operário ou G – gerente): ");
			categoria = leitor.next().toUpperCase();

			if (categoria.equals("O") || categoria.equals("G")) {

				y = false;
			} else {
				System.out.printf("Tá ERRANDO DE MAIS hein!!!.. Vamos DE novo... \n \n");
			}

		} while (y);
		// =============================================================================
		// RECEBIMENTO DE VALORES DO ATRIBUTO HORAS TRABALHADAS NO MES COM REQUESITO "A"

		System.out.printf("Quantas horas trabalhada no mês: ");
		horasTrabalhadas = leitor.nextInt();
		
		// =============================================================================
		// PROCESSO VALOR HORA TRABALHADA

		double valorHoraTrabalhada = 0;

		if (categoria.equals("G") && turno.equals("N")) {
			valorHoraTrabalhada = salarioMinimo * 0.18;
		} else if (categoria.equals("G") && (turno.equals("M") || turno.equals("V"))) {
			valorHoraTrabalhada = +salarioMinimo * 0.15;
		} else if (categoria.equals("O") && turno.equals("N")) {
			valorHoraTrabalhada = salarioMinimo * 0.13;
		} else if (categoria.equals("O") && (turno.equals("M") || turno.equals("V"))) {
			valorHoraTrabalhada = salarioMinimo * 0.1;
		}
		// =============================================================================
		// PROCESSO SALARIO INICIAL

		double salarioInicial = valorHoraTrabalhada + horasTrabalhadas;

		// =============================================================================
		// PROCESSO VALOR DO AUXILIO ALIMENTACAO RECEBIDO PELO FUNCIONARIO

		if (salarioInicial <= 300) {
			auxAlim = salarioInicial * 0.2;
		} else if (salarioInicial > 300 && salarioInicial <= 600) {
			auxAlim = salarioInicial * 0.15;
		} else if (salarioInicial > 600) {
			auxAlim = salarioInicial * 0.05;
		}

		// =============================================================================
		// PROCESSO MOSTRAR NA TELA O RESULTADO

		System.out.printf("============== RESULTADO =============== \n\n");
		System.out.printf(
				"Codigo:#%d \nNome:%s \nHoras Trabalhadas:%d \nValor da hora:R$ %.2f \nSalario Inicial:R$ %.2f \nAuxilio Alimentação: R$ %.2f \n\nSalario Final %.2f",
				contador, nome, horasTrabalhadas, valorHoraTrabalhada, salarioInicial, auxAlim,
				(salarioInicial + auxAlim));

//		System.out.println("valor da Alimentacao " + auxAlim);
//		System.out.println("Valor da hora trabalhada " + valorHoraTrabalhada);
//		System.out.println("salario inicial " + salarioInicial);

		categoria = leitor.next();

		leitor.close();

	}

}