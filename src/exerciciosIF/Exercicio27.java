package exerciciosIF;

import java.util.Scanner;

//27. Condição eleitoral (IF)

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		int idade = leitor.nextInt();

		if (idade < 16) {
			System.out.println("Não pode votar");
		}
		if ((idade >= 16 && idade < 18)||(idade >= 65)) {
			System.out.println("Facultativo");
		}
		if (idade >= 18 && idade <= 64) {
			System.out.println("Obrigatório");
		}
		
		leitor.close();

	}

}
