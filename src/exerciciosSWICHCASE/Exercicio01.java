package exerciciosSWICHCASE;

import java.util.Scanner;

//1. Estruturas condicionais e de repeti��o: Pre�o de produtos (Swich Case)

public class Exercicio01 {

	public static void main(String[] args) {
		// OBJETOS
		Scanner leitor = new Scanner(System.in);

		// VARIAVEIS
		boolean x = true;
		double imposto;
		int categoria;
		double produto;
		double aumento = 0;
		String situacao;

		System.out.printf("========== Pre�o ==========\n");
		System.out.print("Insira o valor do Produto: ");
		produto = leitor.nextDouble();

		System.out.printf("\n========== Categoria ==========\n");
		System.out.printf("     1 � limpeza\n     2 � alimenta��o\n     3 � vestu�rio\n\n");

		do {
			System.out.println("Insira sua Categoria: ");
			categoria = leitor.nextInt();
			if (categoria == 1) {
				x = false;
			} else if (categoria == 2) {
				x = false;
			} else if (categoria == 3) {
				x = false;
			} else {
				System.out.printf("Op��o INCORRETA!!!\n\n");
			}
		} while (x);

		System.out.printf("\n========== REFRIGERA��O ==========\n");
		x = true;
		do {
			System.out.println("Precisa de Refrigera��o S/N: ");
			situacao = leitor.next().toUpperCase();
			if (situacao.equals("N")) {
				x = false;
			} else if (situacao.equals("S")) {
				x = false;
			} else {
				System.out.printf("Op��o INCORRETA!!!\n\n");
			}
		} while (x);

		
// CATEGORIA
		switch (categoria) {
		case 1:
			if (produto <= 25) {
				aumento = (produto * 0.05);
			} else {
				aumento = (produto * 0.12);
			}

			break;
		case 2:
			if (produto <= 25) {
				aumento = (produto * 0.08);
			} else {
				aumento = (produto * 0.15);
			}

			break;

		case 3:
			if (produto <= 25) {
				aumento = (produto * 0.1);
			} else {
				aumento = (produto * 0.18);
			}

			break;

		default:
			System.out.println("Incorreto");
			break;
		}

// SITUACAO
		switch (situacao) {
		case "N":
			if (produto <= 25) {
				aumento = (produto * 0.05) + produto;

			} else {
				aumento = (produto * 0.12) + produto;

			}
			
			break;
		case "S":
			if (produto <= 25) {
				aumento = (produto * 0.08) + produto;
			} else {
				aumento = (produto * 0.15) + produto;
			}
			
			break;

		default:
			System.out.println("Erro");
			break;
		}
		if (categoria == 2 && situacao == "N") {
			imposto = produto * 0.05;
		} else {
			imposto = produto * 0.08;
		}

		System.out.println("Produto saiu por: R$" + produto);
		System.out.println("Com aumento de categora ,sair� por: R$" + (produto + aumento));
		System.out.println("Com impostos ficar� com: R$" + ((produto + aumento) + imposto));
		System.out.println("Precisa de refrigera��o: " + situacao);
		
		if ((produto+ aumento) <= 50) {
			System.out.println("Classifica��o: Barato");
		}else if ((produto+ aumento) > 50 && (produto+ aumento) < 120 ) {
			System.out.println("Classifica��o: Normal");
		}else {
			System.out.println("Classifica��o: Caro");
		}
		leitor.close();

	}

}
