package exerciciosIF;

import java.util.Scanner;

//11. Compra de ma��s (IF)

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double varejoMaca = 0.30;
		double atacadoMaca = 0.25;
		
		System.out.println("Quantas ma��s deseja comprar: ");
		int qtMacas = leitor.nextInt();
		
		if (qtMacas >= 12) {
			System.out.println("Quantidade de ma��s: "+qtMacas+" uni");
			System.out.printf("Valor Total da Compra: R$%.2f",qtMacas * atacadoMaca);
		} else {
			System.out.println("Quantidade de ma��s: "+qtMacas+" uni");
			System.out.printf("Valor Total da Compra: R$%.2f", qtMacas * varejoMaca);
		}
		
		leitor.close();

	}

}
