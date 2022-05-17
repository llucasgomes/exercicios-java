package exerciciosWHILE;

import java.util.Scanner;

//6. Receber nomes e salários (While)

public class Exercicio06 {

	public static void main(String[] args) {
		// OBJETO
				Scanner leitor = new Scanner(System.in);

				// VARIAVEIS
				double salarioCarlos;
				double salarioJoao;
				int contador = 0;

				System.out.print("Qual será o salario de Carlos: R$ ");
				salarioCarlos = leitor.nextDouble();
				salarioJoao = salarioCarlos / 3;

				// PROCESSO

				processo(salarioCarlos, salarioJoao, contador);

				leitor.close();

	}
	private static void processo(double salarioCarlos, double salarioJoao, int contador) {
		do {
			salarioCarlos = salarioCarlos + (salarioCarlos * 0.4);
			salarioJoao = salarioJoao + (salarioJoao * 0.5);

			contador++;

		} while (salarioJoao <= salarioCarlos);
		
		System.out.printf("Demorou cerca de %d meses para que o salario de Joao ultrapasse o de Carlos %n", contador);

		do {
			salarioCarlos = salarioCarlos + (salarioCarlos * 0.2);
			salarioJoao = salarioJoao + (salarioJoao * 0.5);

			contador++;

		} while (salarioJoao != salarioCarlos);
		System.out.printf("Demorou cerca de %d meses para os salarios dos funcionarios %n se igualarem", contador);
	}

}
