package exerciciosDOWHILE;
//1. Estruturas condicionais e de repetição: Triângulo (Do-While)

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int lados = 0;

		for (int i = 1; i < 4; i++) {
			
			do {
				System.out.printf("\n%d º valor: ",i);
				lados = leitor.nextInt();
				if (lados <= 0) {
					System.out.println("Insira um valor que nao seja igual ou menor que ZERO!!!!!!!");
				}

			} while (lados <= 0);
			
			lados+=lados;
		}
		System.out.println("O valor da área do triangulo é: "+ lados);
		leitor.close();

	}

}
