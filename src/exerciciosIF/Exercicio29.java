package exerciciosIF;
//29. Média final do faluno (IF)

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a 1ª nota: ");
		int nota1 = leitor.nextInt();
		System.out.print("Informe a 2ª nota: ");
		int nota2 = leitor.nextInt();
		System.out.print("Informe a 3ª nota: ");
		int nota3 = leitor.nextInt();
		System.out.print("Informe o numero de aulas da Máteria: ");
		int nAulas = leitor.nextInt();
		System.out.print("Quantas faltas");
		int nFaltas = leitor.nextInt();
		
		double mediaNota = (nota1+nota2+nota3)/3;
		
		
		if (mediaNota < 3 || nFaltas <= (nAulas * 0.25)  ) {
			System.out.print("REPROVADO");
			
		}else if (mediaNota > 7   ) {
			System.out.print("APROVADO");
			
		}else {
			System.out.print("EXAME");
		}
		
		
		
		
		leitor.close();
	}

}
