package exerciciosIF;

import java.util.Scanner;

//14. Pol�gono (IF)


public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de lados do Pol�gono: ");
		int lados = leitor.nextInt();
		System.out.print("Insira a medida de cada lado: ");
		double medidaLado = leitor.nextDouble();
		
		if (lados == 3) {
			System.out.printf("TRIANGULO com �rea de %.2f",lados * medidaLado);
		}else if (lados == 4) {
			System.out.printf("QUADRADO com �rea de %.2f",lados * medidaLado);
		}else if (lados == 5) {
			System.out.printf("PENTAGONO");
		}else if (lados > 5) {
			System.out.printf("POL�GONO N�O IDENTIFICADO");
		}else if (lados < 3) {
			System.out.printf("N�O � UM POL�GONO");
		}
		
		leitor.close();
		
	}

}
