package exerciciosIF;

import java.util.Scanner;

//26. N�meros negativos (IF)

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.println("Informe o 1� numero:");
		int valor1 = leitor.nextInt();
		System.out.println("Informe o 2� numero:");
		int valor2 = leitor.nextInt();
		System.out.println("Informe o 3� numero:");
		int valor3 = leitor.nextInt();
		
		if (valor1 < 0) {
			contador++;	
		} 
		if (valor2 < 0) {
			contador++;	
		} 
		if (valor3 < 0) {
			contador++;	
		} 
		
		System.out.printf("\nExiste %d numeros negativos;",contador);
		leitor.close();

	}

}
