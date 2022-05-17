package exerciciosIF;

import java.util.Scanner;

//17. Triângulo (IF)

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner write = new Scanner(System.in);
		
		System.out.print("Quantos lados tem seu TRIANGULO: ");
		int lados = write.nextInt();
		System.out.print("Valor de seus lados são iguais(s/n) : ");
		String resp = write.next().toUpperCase();
		
		if (resp.equals("S")) {
			if (lados == 3) {
				System.out.println("Triângulo Equilátero");
			}
			if (lados == 2) {
				System.out.println("Triângulo Isóscele");
			}
			
		}else {
			System.out.println("Triângulo Escaleno");
		}
		
		
		
		write.close();

	}

}
