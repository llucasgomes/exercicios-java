package exerciciosIF;

import java.util.Scanner;

//N�mero maior (IF)

public class Exercicio08 {

	public static void main(String[] args) {
		// OBJETO
				Scanner leitor = new Scanner(System.in);
				// VARIAVEIS
				int valor1, valor2;
				
				//RECEBIMENTO DE DADOS
				System.out.println("====== N�mero Maior ======");
				System.out.print("Insira o 1� n�mero: ");
				valor1 = leitor.nextInt();
				System.out.print("Insira o 2� n�mero: ");
				valor2 = leitor.nextInt();

				// PROCESSO E SAIDA
				if (valor1 > valor2) {
					System.out.printf("Entre os valores informados, o maior numero � %d", valor1);

				} else {
					System.out.printf("Entre os valores informados, o maior numero � %d", valor2);
				}

				leitor.close();


	}

}
