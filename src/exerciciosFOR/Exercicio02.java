package exerciciosFOR;

import java.util.Scanner;

//2. Estruturas condicionais e de repetição: Tabuada com entrada do usuário (FOR)

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("1 - SOMAR\n");
		System.out.print("2 - SUBTRAIR\n");
		System.out.print("3 - MULTIPLICAR\n");
		System.out.print("4 - DIVIDIR\n\n");
		System.out.print("Insira qual tabuada deseja usar: ");
		int operador = leitor.nextInt();
		System.out.print("Insira o valor dela: ");
		int valor = leitor.nextInt();
		
		
		//PROCESSO
		
		switch (operador) {
		case 1:
			for (int i = 1; i <=10 ; i++) {
				System.out.printf(" %d + %d = %d \n", valor , i , valor + i);
			}
			break;
		case 2:
			for (int i = 1; i <=10 ; i++) {
				System.out.printf(" %d - %d = %d \n", valor , i , valor - i);
			}
			break;
		case 3:
			for (int i = 1; i <=10 ; i++) {
				System.out.printf(" %d * %d = %d \n", valor , i , valor * i);
			}
			break;
		case 4:
			for (int i = 1; i <=10 ; i++) {
				System.out.printf(" %d / %d = %d \n", valor , i , valor / i);
			}
			break;
		default:
			break;
		}
		
		
		
		
		
		
		leitor.close();

	}

}
