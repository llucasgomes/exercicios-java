package exerciciosIF;

import java.util.Scanner;

//9. Idade para voto (IF)

public class Exercicio09 {

	public static void main(String[] args) {
		// OBJETO
				Scanner leitor = new Scanner(System.in);
				

				// RECEBIMENTO DE DADOS
				System.out.println("====== Você ja vota? ======");
				System.out.println("Vamos verificar.....");
				
				
				System.out.print("Insira o sua data de nascimento: ");
				int anoNascimento = leitor.nextInt();
				
				int idade = Math.abs(anoNascimento - 2022);
				
				if (idade < 16 ) {
					System.out.printf("Que pena!! \nNo momento vc nao pode votar...\n Apareca daqui a %d ano(s)", Math.abs(idade - 18));
					
				}else {
					System.out.println("Você já se encontra apto a votacao deste ano");
				}

				leitor.close();

	}

}
