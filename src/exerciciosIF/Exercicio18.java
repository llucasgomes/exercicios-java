package exerciciosIF;

import java.util.Scanner;

//18. Ângulos do triângulo (IF)

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("1º Triangulo : ");
		int triangulo1 = leitor.nextInt();
		System.out.print("1º Triangulo : ");
		int triangulo2 = leitor.nextInt();
		System.out.print("1º Triangulo : ");
		int triangulo3 = leitor.nextInt();
		
		if (triangulo1 > 90 ||triangulo2 > 90 || triangulo3 > 90) {
			System.out.println("Triângulo Obtusângulo: Possui um ângulo obtuso. (maior que90º)");
		}else if (triangulo1 < 90 && triangulo2 < 90 && triangulo3 < 90) {
			System.out.println("Triângulo Acutângulo: Possui três ângulos agudos. (menor que 90º");
		}else if (triangulo1 == 90 ||triangulo2 == 90 || triangulo3 == 90) {
			System.out.println("Triângulo Retângulo: Possui um ângulo reto. (igual a 90º)");
		}
		;
		
		
		leitor.close();

	}

}
