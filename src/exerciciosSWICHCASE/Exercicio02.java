package exerciciosSWICHCASE;


import java.util.Scanner;

//2. Estruturas condicionais e de repetição: Compra de produto (Switch Case)

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int codigo;
		boolean x = true;
		int preco = 0;
		double desconto = 0;

		// CODIGO
		do {
			System.out.print("Insira o codigo do produto ( 1-40 ): ");
			codigo = leitor.nextInt();
			if (codigo > 40 || codigo <= 0) {
				System.out.printf("CODIGO NÃO RECONHECIDO\n\n");
			} else {
				x = false;
			}
		} while (x);

		// PRECO DO PRODUTO
		if (codigo > 0 && codigo <= 10) {
			preco = 10;
		} else if (codigo > 10 && codigo <= 20) {
			preco = 15;
		} else if (codigo > 20 && codigo <= 30) {
			preco = 20;
		} else if (codigo > 30 && codigo <= 40) {
			preco = 30;
		}

		// QUANTIDADE DO PRODUTO
		System.out.println("Insira a quantidade do item: ");
		int qtItem = leitor.nextInt();

		
		// CALCULAR O DESCONTO
		double valorProdutos = (double)preco * qtItem;
		
		switch (preco) {
		case 10:
			if (valorProdutos <=250) {
				desconto = preco * 0.05;
			}
			break;
		case 15:
			if (valorProdutos >250 && valorProdutos <= 500) {
				desconto = preco * 0.1;
			}
			break;
		case 20:
			if (valorProdutos >= 50) {
				desconto = preco * 0.15;
			}

			break;
		case 30:

			break;
		default:
			
			break;
		}

		// VALOR DA NOTA
		double valorNota = preco * qtItem;

		System.out.println("Codigo: #" + codigo);
		System.out.println("Quantidade: " + qtItem);
		System.out.println("Preço: R$" + preco + " unidade.");
		System.out.println("Valor: R$" + valorNota);
		System.out.println("Desconto de R$" + (((double) desconto) * qtItem));
		System.out.println("Valor em Nota R$" + (valorNota - (((double) desconto) * qtItem)));

		leitor.close();
	}

}
