package exerciciosIF;

import java.util.Scanner;

//17. Tri�ngulo (IF)

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner write = new Scanner(System.in);
		
		System.out.print("Quantos lados tem seu TRIANGULO: ");
		int lados = write.nextInt();
		System.out.print("Valor de seus lados s�o iguais(s/n) : ");
		String resp = write.next().toUpperCase();
		
		if (resp.equals("S")) {
			if (lados == 3) {
				System.out.println("Tri�ngulo Equil�tero");
			}
			if (lados == 2) {
				System.out.println("Tri�ngulo Is�scele");
			}
			
		}else {
			System.out.println("Tri�ngulo Escaleno");
		}
		
		
		
		write.close();

	}

}
