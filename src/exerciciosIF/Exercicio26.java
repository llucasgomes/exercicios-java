package exerciciosIF;

import java.util.Scanner;

//26. Números negativos (IF)

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.println("Informe o 1º numero:");
		int valor1 = leitor.nextInt();
		System.out.println("Informe o 2º numero:");
		int valor2 = leitor.nextInt();
		System.out.println("Informe o 3º numero:");
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
