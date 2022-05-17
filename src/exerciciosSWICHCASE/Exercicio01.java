package exerciciosSWICHCASE;

import java.util.Scanner;

//1. Estruturas condicionais e de repetição: Preço de produtos (Swich Case)

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

		System.out.printf("========== Preço ==========\n");
		System.out.print("Insira o valor do Produto: ");
		produto = leitor.nextDouble();

		System.out.printf("\n========== Categoria ==========\n");
		System.out.printf("     1 – limpeza\n     2 – alimentação\n     3 – vestuário\n\n");

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
				System.out.printf("Opção INCORRETA!!!\n\n");
			}
		} while (x);

		System.out.printf("\n========== REFRIGERAÇÃO ==========\n");
		x = true;
		do {
			System.out.println("Precisa de Refrigeração S/N: ");
			situacao = leitor.next().toUpperCase();
			if (situacao.equals("N")) {
				x = false;
			} else if (situacao.equals("S")) {
				x = false;
			} else {
				System.out.printf("Opção INCORRETA!!!\n\n");
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
		System.out.println("Com aumento de categora ,sairá por: R$" + (produto + aumento));
		System.out.println("Com impostos ficará com: R$" + ((produto + aumento) + imposto));
		System.out.println("Precisa de refrigeração: " + situacao);
		
		if ((produto+ aumento) <= 50) {
			System.out.println("Classificação: Barato");
		}else if ((produto+ aumento) > 50 && (produto+ aumento) < 120 ) {
			System.out.println("Classificação: Normal");
		}else {
			System.out.println("Classificação: Caro");
		}
		leitor.close();

	}

}
