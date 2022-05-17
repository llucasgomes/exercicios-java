package exerciciosIF;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Insira o primeiro valor: ");
		int a = leitor.nextInt();
		System.out.print("Insira o segundo valor: ");
		int b = leitor.nextInt();
		System.out.print("Insira o terceiro valor: ");
		int c = leitor.nextInt();
		
		
		if (a > b && a > c) {
			if (b>c) {
				System.out.printf("%d \n%d \n%d \n ",a,b,c);	
			}else {
				System.out.printf("%d \n%d \n%d \n ",a,c,b);	
			}
		}else if (b > a && b > c) {
			if (a>c) {
				System.out.printf("%d \n%d \n%d \n ",b,a,c);	
			}else {
				System.out.printf("%d \n%d \n%d \n ",b,c,a);	
			}
		}
		else if (c > a && c > b) {
			if (b>a) {
				System.out.printf("%d \n%d \n%d \n ",c,b,a);	
			}else {
				System.out.printf("%d \n%d \n%d \n ",c,a,b);	
			}
		};
	
		
		
		
		
		
		
		
		leitor.close();

	}

}
