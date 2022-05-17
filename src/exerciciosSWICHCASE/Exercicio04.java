package exerciciosSWICHCASE;

import java.util.Scanner;

//4. Estruturas condicionais e de repetição: Operações com números (Switch Case)

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean x = true;
		int operacao;
		double media,valor1, valor2,diferenca,divisao,produto;
		
		

		System.out.printf("========== OPERAÇÕES ==========\n\n");
		System.out.printf(
				"     1 - MEDIA ENTRE OS NUMEROS\n     2 - DIFERENÇA ENTRE OS NUMEROS\n     3 - PRODUTO ENTRE OS NUMEROS\n     4 - DIVISÃO DO 1º PELO 2º\n\n");

		// ESCOLHA DA OPERACAO
		do {
			System.out.print("Insira a operação desejada: ");
			operacao = leitor.nextInt();
			if (operacao > 0 && operacao < 5) {
				x = false;
			} else {
				System.out.printf("Operação NÃO encontrada!!\n\n");
			}

		} while (x);

		// RECIMENTO DE PARAMETROS
		System.out.printf("Insira o 1º valor: ");
		valor1 = leitor.nextInt();
		System.out.print("Insira o 2º valor: ");
		valor2 = leitor.nextInt();

		switch (operacao) {
		case 1:
			media = (valor1 + valor2) / 2;
			System.out.println("Media entre os números é: "+ media);
			break;
		case 2:
			diferenca = Math.abs(valor1 - valor2);
			System.out.println("Diferença entre os números é: "+ diferenca);
			break;
		case 3:
			produto = valor1 * valor2;
			System.out.println("Produto entre os números é: "+ produto);
			break;
		case 4:
			divisao = valor1 / valor2;
			System.out.printf("Produto entre os números é: %.2f",divisao);
			break;

		default:
			break;
		}

		leitor.close();

	}

}
