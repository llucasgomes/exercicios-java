package exerciciosDOWHILE;
//1. Estruturas condicionais e de repeti��o: Tri�ngulo (Do-While)

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int lados = 0;

		for (int i = 1; i < 4; i++) {
			
			do {
				System.out.printf("\n%d � valor: ",i);
				lados = leitor.nextInt();
				if (lados <= 0) {
					System.out.println("Insira um valor que nao seja igual ou menor que ZERO!!!!!!!");
				}

			} while (lados <= 0);
			
			lados+=lados;
		}
		System.out.println("O valor da �rea do triangulo �: "+ lados);
		leitor.close();

	}

}
