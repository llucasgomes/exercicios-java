package exerciciosSWICHCASE;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean x =true;
		int codigo;
		double preco = 0;
		
		
		//ESCOLHA DA OPCAO
		do {
			System.out.print("Insira o codigo de origem de 1-30: ");
			codigo = leitor.nextInt();
			
			if (codigo>0 && codigo <=30) {
				x = false;
			}else {
				System.out.printf("Opcao INCORRETA\n\n");
			}
			
		} while (x);
		
		System.out.print("Insira o preco do produto: R$");
		preco = leitor.nextDouble();
		
		//TRATAMENTO DAS OPCOES
		
		if (codigo == 5 || codigo == 6) {
			codigo= 5;
		}else if (codigo == 7 || codigo == 8 || codigo == 9) {
			codigo= 6;
		}
		else if (codigo > 9 || codigo <= 20) {
			codigo= 7;
		}
		else if (codigo > 20 || codigo <= 30) {
			codigo= 8;
		}
		
		
		switch (codigo) {
		case 1:
			System.out.println("Preco do produto: R$"+preco);
			System.out.println("");
			System.out.println("Procêdencia: Sul");
			break;
		case 2:
			System.out.println("Preco do produto: R$"+preco);
			System.out.println("");
			System.out.println("Procêdencia: Norte");
			break;
		case 3:
			System.out.println("Preco do produto: R$"+preco);
			System.out.println("");
			System.out.println("Procêdencia: Leste");
			break;
		case 4:
			System.out.println("Preco do produto: R$"+preco);
			System.out.println("");
			System.out.println("Procêdencia: Oeste");
			break;
		case 5:
			System.out.println("Preco do produto: R$"+preco);
			System.out.println("");
			System.out.println("Procêdencia: Nordeste");
			break;
		case 6:
			System.out.println("Preco do produto: R$"+preco);
			System.out.println("");
			System.out.println("Procêdencia: Sudeste");
			break;
		case 7:
			System.out.println("Preco do produto: R$"+preco);
			System.out.println("");
			System.out.println("Procêdencia: Centro-Oeste");
			break;
		case 8:
			System.out.println("Preco do produto: R$"+preco);
			System.out.println("");
			System.out.println("Procêdencia: Nordeste");
			break;

		default:
			break;
		}
		
	 
		
		leitor.close();

	}

}
