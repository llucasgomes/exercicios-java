package exerciciosIF;

import java.util.Scanner;

//25. Credito para alunos (IF)

public class Exercicio25 {

	public static void main(String[] args) {
//		A StackX abriu uma linha de crédito para os alunos. O valor máximo da prestação 
//		não poderá ultrapassar 30% do salário bruto. Fazer um programa que permita entrar
//		com o salário bruto, o valor do empréstimo e o número de parcelas e informar o
//		valor da parcela e se o empréstimo pode ou não ser concedido. Caso o empréstimo
//		não possa ser concedido, informar ainda o valor máximo da prestação.
		
		
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
			System.out.println("Emprestimo  não concedido");
			System.out.println("O valor que podemos lhe conseguir con esta quantidade de apercelas é:");
			System.out.println("Emprestimo de R$"+ ((vSalario * 0.3)*nParcelas));
			System.out.printf("%d Parcelas de R$ %.2f",nParcelas, (((vSalario * 0.3)*nParcelas)/nParcelas));
		}
		
		
		
		
		
		leitor.close();
		
		
		
		
		
		

	}

}
