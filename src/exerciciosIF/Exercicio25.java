package exerciciosIF;

import java.util.Scanner;

//25. Credito para alunos (IF)

public class Exercicio25 {

	public static void main(String[] args) {
//		A StackX abriu uma linha de cr�dito para os alunos. O valor m�ximo da presta��o 
//		n�o poder� ultrapassar 30% do sal�rio bruto. Fazer um programa que permita entrar
//		com o sal�rio bruto, o valor do empr�stimo e o n�mero de parcelas e informar o
//		valor da parcela e se o empr�stimo pode ou n�o ser concedido. Caso o empr�stimo
//		n�o possa ser concedido, informar ainda o valor m�ximo da presta��o.
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Salario: ");
		double vSalario = leitor.nextDouble();
		
		System.out.println("Valor do Emprestimo: ");
		double vEmprestimo = leitor.nextDouble();
		
		System.out.println("Numero de parcelas: ");
		int nParcelas = leitor.nextInt();
		
		if ((vEmprestimo / nParcelas) <= (vSalario * 0.3)) {
			System.out.println("Emprestimo concedido");
			System.out.println("Emprestimo de R$"+vEmprestimo);
			System.out.printf("%d Parcelas de R$ %.2f",nParcelas,(vEmprestimo / nParcelas));
		}else {
			System.out.println("Emprestimo  n�o concedido");
			System.out.println("O valor que podemos lhe conseguir con esta quantidade de apercelas �:");
			System.out.println("Emprestimo de R$"+ ((vSalario * 0.3)*nParcelas));
			System.out.printf("%d Parcelas de R$ %.2f",nParcelas, (((vSalario * 0.3)*nParcelas)/nParcelas));
		}
		
		
		
		
		
		leitor.close();
		
		
		
		
		
		

	}

}
