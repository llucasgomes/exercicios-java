package exerciciosDOWHILE;

import java.util.Scanner;

//3. Estruturas condicionais e de repetição: Idades (Do-While)

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int contador = 0;
		int idade = 0;
		int soma = 0;
		double mediaIdade = 0;

		
		System.out.println("=============MEDIA ENTRE IDADES INSERIDAS===============");
		System.out.println("OBS: Finalizar Programa digite zero (0)");
		System.out.println("");
		
		do {
			if (contador == 0) {
				contador++;
				System.out.print("Insira a idade: ");
				idade = leitor.nextInt();
				soma += idade;
				
			} else {
				contador++;
				System.out.print("Insira a proxima a idade: ");
				idade = leitor.nextInt();
				soma += idade;
				
				mediaIdade = soma / contador;
				System.out.println("A media entre as idade é igual a: " + mediaIdade);
				System.out.println("");
			}
		System.out.println("");

		} while (idade != 0 );
		System.out.println("Programa finalizado");
		leitor.close();

	}

}
