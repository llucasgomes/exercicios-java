package exerciciosIF;

import java.util.Scanner;

//24. Divisível por 3 e por 7 (IF)

public class Exercicio24 {

	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("===== DIVISIVEL POR 3 e 7 =====");
		System.out.print("Informe o numero: ");
		int valor = leitor.nextInt();
		
		 int x = valor%3;
		 int y = valor%3;
		 
		if (x == 0 && y == 0 ) {
			System.out.println("Ele é divisivel pelos dois (3 e 7 )");
		} else {
			System.out.println("Ele não é divisivel pelos dois (3 e 7 )");
		}
		
		
		leitor.close();

	}

}
