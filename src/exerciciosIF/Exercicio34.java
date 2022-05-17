package exerciciosIF;
//34. Impressão de receita (IF)

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe sua idade : ");
		int idade = leitor.nextInt();
		System.out.println("Informe seu peso: ");
		double peso = leitor.nextDouble();
		double gotas;

		if (idade >= 12 && peso >= 60) {
			gotas = (1000/500)*20;
			System.out.println(gotas + " Gotas");
		}
		if (idade >= 12 && peso < 60) {
			gotas = (875/500)*20;
			System.out.println(gotas + " Gotas");
		}
		if (idade < 12) {
			if (peso >= 5 && peso <= 9) {
				gotas = (125/500)*20;
				System.out.println(gotas + " Gotas");
			}else if (peso > 9 && peso <= 16) {
				gotas = (250/500)*20;
				System.out.println(gotas + " Gotas");
			}else if (peso > 16 && peso <= 24) {
				gotas = (375/500)*20;
				System.out.println(gotas + " Gotas");
			}else if (peso > 24 && peso <= 30) {
				gotas = (500/500)*20;
				System.out.println(gotas + " Gotas");
			}else if (peso > 30) {
				gotas = (750/500)*20;
				System.out.println(gotas + " Gotas");
			}

		}

		leitor.close();

	}

}
