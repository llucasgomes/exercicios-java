package exerciciosDOWHILE;

import java.util.Scanner;

//2. Estruturas condicionais e de repetição: Menu de opções (Do-While)

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		double salario;

		do {

			System.out.println(" =========== MENU ===========");
			System.out.println("|  1 - Imposto               |");
			System.out.println("|  2 – Novo Salário          |");
			System.out.println("|  3 – Classificação         |");
			System.out.println("|  4 – Finalizar o programa  |");
			System.out.println(" ============================");
			System.out.println("");

			// ESCOLHA DA OPÇÃO
			do {
				System.out.println("Insira a opção: ");
				opcao = leitor.nextInt();

				if (opcao <= 0 || opcao > 4) {
					System.out.printf("Opção INVALIDA!!!!\n\n");
				}
			} while (opcao <= 0 || opcao > 4);

			System.out.println("Informe seu salário : ");
			salario = leitor.nextDouble();

			switch (opcao) {
			case 1:
				if (salario < 500) {
					System.out.println("Você pagará um imposto de 5%");
					System.out.println("que sera no valor de R$ " + (salario * 0.05));

				} else if (salario >= 500 && salario <= 850) {
					System.out.println("Você pagará um imposto de 10%");
					System.out.println("que sera no valor de R$ " + (salario * 0.10));
				} else if (salario > 850) {
					System.out.println("Você pagará um imposto de 15% ");
					System.out.println("que sera no valor de R$ " + (salario * 0.15));
				}

				break;
			case 2:
				if (salario > 1500) {
					System.out.printf("Aumento de R$250,00 \nNovo Salario:R$%.2f", salario + 250);
					System.out.println("");
				} else if (salario >= 750 && salario <= 1500) {
					System.out.printf("Aumento de R$50,00 \nNovo Salario:R$%.2f", salario + 50);
					System.out.println("");
				} else if (salario >= 450 && salario < 750) {
					System.out.printf("Aumento de R$75,00 \nNovo Salario:R$%.2f", salario + 75);
					System.out.println("");
				} else if (salario < 450) {
					System.out.printf("Aumento de R$100,00 \nNovo Salario:R$%.2f", salario + 100);
					System.out.println("");
				}
				break;
			case 3:
				if (salario <= 700) {
					System.out.println("Mal remunerado");
				} else {
					System.out.println("Bem remunerado");
				}

				break;
			default:
				break;
			}

			//SE QUER CONTINUAR OU NAO
			
			System.out.println("Deseja realizar outra Operação ( s/n ): ");
			String resp = leitor.next().toUpperCase();

			if (resp.equals("N")) {
				opcao = 4;
			}

		} while (opcao < 4);

		System.out.println("Programa finalizado");

		leitor.close();
	}

}
