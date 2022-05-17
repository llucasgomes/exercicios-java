package exerciciosIF;

import java.util.Scanner;

//14. Polígono (IF)


public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de lados do Polígono: ");
		int lados = leitor.nextInt();
		System.out.print("Insira a medida de cada lado: ");
		double medidaLado = leitor.nextDouble();
		
		if (lados == 3) {
			System.out.printf("TRIANGULO com área de %.2f",lados * medidaLado);
		}else if (lados == 4) {
			System.out.printf("QUADRADO com área de %.2f",lados * medidaLado);
		}else if (lados == 5) {
			System.out.printf("PENTAGONO");
		}else if (lados > 5) {
			System.out.printf("POLÍGONO NÃO IDENTIFICADO");
		}else if (lados < 3) {
			System.out.printf("NÃO É UM POLÍGONO");
		}
		
		leitor.close();
		
	}

}
