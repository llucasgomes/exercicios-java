package exerciciosWHILE;

import java.util.Scanner;

//7. Conjunto de valores (While)

public class Exercicio07 {

	public static void main(String[] args) {
		//OBJETO
		Scanner leitor = new Scanner(System.in);
		
		//TRIBUTOS
		double resultado;
		boolean sair = true;

		
		do {
			System.out.println("");
			System.out.printf("Insira o valor: ");
			double valor = leitor.nextDouble();
			
			resultado = Math.pow(valor, (double) 2);
			System.out.println(resultado);
			System.out.println("Valor de "+(int)valor+"² é "+ Math.pow(valor, (double) 2));
			System.out.println("Valor de "+(int)valor+"³ é "+ Math.pow(valor, (double) 3));

			System.out.println("A Raiz quadrada de "+(int) valor+" é "+ Math.sqrt(valor) );
			System.out.println("");
			
			System.out.print("Deseja sair aperte 0 ou numero negativo, ou 5 para continuar : ");
			
			int resp = leitor.nextInt();
			if (resp == 5) {
				sair = false;
				System.out.println("Programa finalizado");
			}
			
			
		} while (sair);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		leitor.close();
	}

}
