package exerciciosIF;

import java.util.Scanner;

//4. Sal�rio bruto (IF)

public class Exercicio04 {

	public static void main(String[] args) {
		// Objeto
				Scanner leitor = new Scanner(System.in);

				// Variavel
				String nome;
				double salarioBruto, valorLiquido;

				// RECEBIMENTO DE DADOS
				System.out.println("===== Gratifica��o Salarial =====");
				System.out.print("Insira seu nome: ");
				nome = leitor.next();
				System.out.print("Insira o valor de seu salario: ");
				salarioBruto = leitor.nextDouble();

				// PROCESSO E SAIDA

				if (salarioBruto <= 350) {
					valorLiquido = (salarioBruto - (salarioBruto * 0.7)) + 100;
					System.out.printf(
							"O Sr(a) %s com salario de R$ %.2f , recebera o gratifica��o de R$ 100.00,%n no entanto.. %n retirando os impostos voc� receber� uma valor liquido de %.2f %n",
							nome, salarioBruto, valorLiquido);
				} else if (salarioBruto <= 351 && salarioBruto <= 600) {
					valorLiquido = (salarioBruto - (salarioBruto * 0.7)) + 75;
					System.out.printf(
							"O Sr(a) %s com salario de R$ %.2f , recebera o gratifica��o de R$ 100.00,%n no entanto.. %n retirando os impostos voc� receber� uma valor liquido de %.2f %n",
							nome, salarioBruto, valorLiquido);
				} else if (salarioBruto <= 601 && salarioBruto <= 900) {
					valorLiquido = (salarioBruto - (salarioBruto * 0.7)) + 50;
					System.out.printf(
							"O Sr(a) %s com salario de R$ %.2f , recebera o gratifica��o de R$ 100.00,%n no entanto.. %n retirando os impostos voc� receber� uma valor liquido de %.2f %n",
							nome, salarioBruto, valorLiquido);
				} else {
					valorLiquido = (salarioBruto - (salarioBruto * 0.7)) + 35;
					System.out.printf(
							"O Sr(a) %s com salario de R$ %.2f , recebera o gratifica��o de R$ 100.00,%n no entanto.. %n retirando os impostos voc� receber� uma valor liquido de %.2f %n",
							nome, salarioBruto, valorLiquido);

				}

				leitor.close();


	}

}
