package exerciciosIF;

import java.util.Scanner;
//32. Valor de venda (IF)

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		int compra = leitor.nextInt();

		if (compra <= 10) {
			System.out.printf("Valor de venda é R$ %.2f",(compra + (compra*0.7)));
		} else if (compra <= 10 && compra < 30) {
			System.out.printf("Valor de venda é R$ %.2f",(compra + (compra*0.5)));
		} else if (compra <= 30 && compra < 50) {
			System.out.printf("Valor de venda é R$ %.2f",(compra + (compra*0.4)));
		} else if (compra >= 50) {
			System.out.printf("Valor de venda é R$ %.2f",(compra + (compra*0.3)));
		} 

		leitor.close();


	}

}
