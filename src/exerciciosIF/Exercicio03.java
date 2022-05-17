package exerciciosIF;

import java.util.Scanner;

//3. Idade de um nadador (IF)

public class Exercicio03 {

	public static void main(String[] args) {
		//OBJETO
				Scanner leitor = new Scanner(System.in);
				
				//VARIAVEIS
				String nome;
				int idade;
				
				
				//RECEBIMENTO DE DADOS
				System.out.println("===== ATLETA OLIMPICO DE NATACAO =====");
				System.out.print("Insira seu nome: ");
				nome = leitor.next();
				System.out.print("Insira sua idade: ");
				idade = leitor.nextInt();
				
				//	PROCESSO E SAIDA
				if (idade < 5 ) {
					System.out.printf("Me deculpe %s, mas você não chega aos requsitos de idade minima de 5 anos",nome);
					
				} else if(idade >=5 && idade <=7){
					System.out.printf("bem vindo %s , a categorria infantil",nome);
				}else if(idade >=8 && idade <= 10){
					System.out.printf("bem vindo %s , a categoria Juvenil",nome);
				}else if(idade >=11 && idade <= 15){
					System.out.printf("bem vindo %s , a categorria Adolecente",nome);
				}else if(idade >=16 && idade <= 30){
					System.out.printf("bem vindo %s , a categorria Adulto",nome);
				}else {
					System.out.printf("bem vindo %s , a categorria Sênior",nome);
				}
				
				
				leitor.close();
			

	}

}
