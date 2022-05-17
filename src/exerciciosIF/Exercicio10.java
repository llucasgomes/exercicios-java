//Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. 
//A senha válida é o número 1234. Devem ser impressas as seguintes 
//mensagens: 	ACESSO PERMITIDO 
//caso a senha seja válida e  ACESSO NEGADO caso a senha seja inválida.

package exerciciosIF;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean acessar = true;

		System.out.printf("Vamos criar uma senha para login \n\n");
		System.out.print("Insira um nick-name: ");
		String nick = leitor.next();
		System.out.print("Insira uma senha ( Não Vai esquecer ): ");
		String senha = leitor.next();
		System.out.printf("\nVamos Testar.....\n\n");

		do {
			System.out.printf("nick-name: ");
			String nickConf = leitor.next();
			System.out.printf("senha: ");
			String senhaConf = leitor.next();

			if (senha.equals(senhaConf) && nick.equals(nickConf)) {
				System.out.printf("ACESSO PERMITIDO\n");
				acessar = false;
			} else {
				System.out.printf("ACESSO NEGADO!!!!!\n");
				System.out.printf("Vamos tentar novamente....\nTe avisei pra se lembrar rsrsrsr\n");
				
			}
			;

		} while (acessar);
		System.out.println("ATÉ QUE EM FIM, SENTI SUA FALTA");
		leitor.close();

	}

}
