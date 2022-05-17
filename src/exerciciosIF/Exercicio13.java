package exerciciosIF;

import java.util.Scanner;

//13. Altura e sexo (IF)

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Qual seu sexo (M ou F): ");
		String sexo = leitor.next().toUpperCase();
		System.out.print("Insira sua altura: ");
		double altura = leitor.nextDouble();
		
		if (sexo.equals("M")) {
			System.out.printf("Sr, seu peso ideal é %.2f kg",Math.abs(58-(72.7* altura)));
			
		} else {
			System.out.printf("Sra, seu peso ideal é %.2f kg",Math.abs(44.7-(62.1* altura)));
		}
		
		
		
		
		
		
		
		
		
		
		
		leitor.close();
		

	}

}
