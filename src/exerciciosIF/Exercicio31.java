package exerciciosIF;
//31. Mensalidades de plano de saúde (IF)

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		int idade = leitor.nextInt();

		if (idade <= 10) {
			System.out.printf("Seu valor de Plano de saúde é R$ 30,00");
		} else if (idade < 10 && idade <= 29) {
			System.out.printf("Seu valor de Plano de saúde é R$ 60,00");
		} else if (idade < 29 && idade <= 45) {
			System.out.printf("Seu valor de Plano de saúde é R$ 120,00");
		} else if (idade < 45 && idade <= 59) {
			System.out.printf("Seu valor de Plano de saúde é R$ 150,00");
		} else if (idade < 59 && idade <= 65) {
			System.out.printf("Seu valor de Plano de saúde é R$ 250,00");
		} else if (idade < 65) {
			System.out.printf("Seu valor de Plano de saúde é R$ 400,00");
		}

		leitor.close();

	}

}
