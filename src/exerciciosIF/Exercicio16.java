package exerciciosIF;
//16. Tr�s valores e o maior deles (IF)

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Insira o primeiro valor: ");
		int a = leitor.nextInt();
		System.out.print("Insira o segundo valor: ");
		int b = leitor.nextInt();
		System.out.print("Insira o terceiro valor: ");
		int c = leitor.nextInt();
		
		
		if (a > b && a > c) {
			System.out.print("O maior valor �: "+1);
		}
		if (b > a && b > c) {
			System.out.print("O maior valor �: "+b);
		}
		if (c > a && c > b) {
			System.out.print("O maior valor �: "+c);
		};
	
		
		leitor.close();


	}

}
