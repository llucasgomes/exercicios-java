package exerciciosIF;

import java.util.Scanner;

//18. �ngulos do tri�ngulo (IF)

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("1� Triangulo : ");
		int triangulo1 = leitor.nextInt();
		System.out.print("1� Triangulo : ");
		int triangulo2 = leitor.nextInt();
		System.out.print("1� Triangulo : ");
		int triangulo3 = leitor.nextInt();
		
		if (triangulo1 > 90 ||triangulo2 > 90 || triangulo3 > 90) {
			System.out.println("Tri�ngulo Obtus�ngulo: Possui um �ngulo obtuso. (maior que90�)");
		}else if (triangulo1 < 90 && triangulo2 < 90 && triangulo3 < 90) {
			System.out.println("Tri�ngulo Acut�ngulo: Possui tr�s �ngulos agudos. (menor que 90�");
		}else if (triangulo1 == 90 ||triangulo2 == 90 || triangulo3 == 90) {
			System.out.println("Tri�ngulo Ret�ngulo: Possui um �ngulo reto. (igual a 90�)");
		}
		;
		
		
		leitor.close();

	}

}
