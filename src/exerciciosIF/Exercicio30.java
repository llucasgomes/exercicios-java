package exerciciosIF;

import java.util.Scanner;

//30. Venda de um produto (IF)

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Qual o valor de compra: ");
		double compra = leitor.nextDouble();

		if (compra < 20) {
			System.out.printf("O valor da compra foi %.2f , poderá vender a %.2f (Lucro de 45%%)", compra,
					(compra + (compra * 0.45)));
		} else if (compra >= 20) {
			System.out.printf("O valor da compra foi %.2f , poderá vender a %.2f (Lucro de 30%%)", compra,
					(compra + (compra * 0.3)));
		}

		leitor.close();

	}

}
