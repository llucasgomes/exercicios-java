package exerciciosIF;

import java.util.Scanner;

								//2. Idade e peso (IF)


public class Exercicio02 {

	public static void main(String[] args) {
		// Objeto
		Scanner leitor = new Scanner(System.in);

		// Variavel
		String nome;
		int idade;
		double peso;

		// RECEBIMENTO DE DADOS

		System.out.println("===== GRUPO DE RISCO =====");
		System.out.print("Insira seu nome: ");
		nome = leitor.next();
		System.out.print("Insira sua idade: ");
		idade = leitor.nextInt();
		System.out.print("Insira seu peso corporal em Kg: ");
		peso = leitor.nextDouble();

		// PROCESSO E SAIDA

		if (idade <= 20) {
			if (peso <= 60) {
				System.out.print("O Sr(a) " + nome + ", se encontra no grupo de risco n�mero 9");

			} else if (peso > 60 && peso < 90) {
				System.out.print("O Sr(a) " + nome + ", se encontra no grupo de risco n�mero 8");
			} else {
				System.out.print("O Sr(a) " + nome + ", se encontra no grupo de risco n�mero 7");
			}
		} else if (idade > 20 && idade < 50) {
			if (peso <= 60) {
				System.out.print("O Sr(a) " + nome + ", se encontra no grupo de risco n�mero 6");

			} else if (peso > 60 && peso < 90) {
				System.out.print("O Sr(a) " + nome + ", se encontra no grupo de risco n�mero 5");
			} else {
				System.out.print("O Sr(a) " + nome + ", se encontra no grupo de risco n�mero 4");
			}
		} else {
			if (peso <= 60) {
				System.out.print("O Sr(a) " + nome + ", se encontra no grupo de risco n�mero 3");

			} else if (peso > 60 && peso < 90) {
				System.out.print("O Sr(a) " + nome + ", se encontra no grupo de risco n�mero 2");
			} else {
				System.out.print("O Sr(a) " + nome + ", se encontra no grupo de risco n�mero 1");
			}
		}

		leitor.close();

	}

}
