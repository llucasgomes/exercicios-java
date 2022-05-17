package exerciciosIF;
//33. Endocrino (IF)

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe seu peso : ");
		double peso = leitor.nextDouble();
		System.out.println("Informe seu altura: ");
		double altura = leitor.nextDouble();

		double imc = peso / (altura * altura);

		if (imc < 20) {
			System.out.printf("Abaixo do peso");
		} else if (imc >= 20 && imc <= 25) {
			System.out.printf("Normal");
		} else if (imc > 25 && imc <= 30) {
			System.out.printf("Excesso de peso");
		} else if (imc > 30 && imc <= 35) {
			System.out.printf("Obesidade");
		} else if (imc > 35) {
			System.out.printf("	Obesidade mórbida");
		}

		leitor.close();

	}

}
