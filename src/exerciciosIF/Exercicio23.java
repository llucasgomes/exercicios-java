package exerciciosIF;

import java.util.Scanner;

//23. N�mero m�ltiplo de 3 (IF)

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("===== MULTIPLO DE 3 =====");
		System.out.print("Informe o numero numero: ");
		int valor = leitor.nextInt();
		
		valor = valor%3;
		if (valor == 0) {
			System.out.println("Ele � multiplo de 3");
		} else {
			System.out.println("Ele n�o � multiplo de 3");
		}
		
		
		leitor.close();

	}

}
