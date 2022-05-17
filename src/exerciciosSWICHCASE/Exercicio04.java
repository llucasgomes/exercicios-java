package exerciciosSWICHCASE;

import java.util.Scanner;

//4. Estruturas condicionais e de repeti��o: Opera��es com n�meros (Switch Case)

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean x = true;
		int operacao;
		double media,valor1, valor2,diferenca,divisao,produto;
		
		

		System.out.printf("========== OPERA��ES ==========\n\n");
		System.out.printf(
				"     1 - MEDIA ENTRE OS NUMEROS\n     2 - DIFEREN�A ENTRE OS NUMEROS\n     3 - PRODUTO ENTRE OS NUMEROS\n     4 - DIVIS�O DO 1� PELO 2�\n\n");

		// ESCOLHA DA OPERACAO
		do {
			System.out.print("Insira a opera��o desejada: ");
			operacao = leitor.nextInt();
			if (operacao > 0 && operacao < 5) {
				x = false;
			} else {
				System.out.printf("Opera��o N�O encontrada!!\n\n");
			}

		} while (x);

		// RECIMENTO DE PARAMETROS
		System.out.printf("Insira o 1� valor: ");
		valor1 = leitor.nextInt();
		System.out.print("Insira o 2� valor: ");
		valor2 = leitor.nextInt();

		switch (operacao) {
		case 1:
			media = (valor1 + valor2) / 2;
			System.out.println("Media entre os n�meros �: "+ media);
			break;
		case 2:
			diferenca = Math.abs(valor1 - valor2);
			System.out.println("Diferen�a entre os n�meros �: "+ diferenca);
			break;
		case 3:
			produto = valor1 * valor2;
			System.out.println("Produto entre os n�meros �: "+ produto);
			break;
		case 4:
			divisao = valor1 / valor2;
			System.out.printf("Produto entre os n�meros �: %.2f",divisao);
			break;

		default:
			break;
		}

		leitor.close();

	}

}
