package exerciciosIF;
//28. Idade completa (IF)

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int idade = leitor.nextInt();
		
		System.out.printf("\nData Atual: 2022");
		System.out.println("Data de Nacimento: " + (2022 - idade));
		
		
		leitor.close();

	}

}
