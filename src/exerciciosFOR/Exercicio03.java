package exerciciosFOR;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random random = new Random();
		
		Cidades cidade1 = new Cidades();
		Cidades cidade2 = new Cidades();
		Cidades cidade3 = new Cidades();
		Cidades cidade4 = new Cidades();
		Cidades cidade5 = new Cidades();
		
		int maxAcidentes=0;
		int minAcidentes=0;
		int cidadeMax = 0;
		int cidadeMin = 0;
		
		for (int i = 0; i < 5; i++) {
			
			if (i == 0) {
				cidade1.codigo = random.nextInt(2000);
				System.out.println("Cidade de codigo # "+cidade1.codigo);
				System.out.printf("Insira o número de Carros: ");
				cidade1.nCarros = leitor.nextInt();
				System.out.printf("Insira o número de Acidentes: ");
				cidade1.nAcidentes = leitor.nextInt();
				System.out.println("");
				
				maxAcidentes = cidade1.nAcidentes;
				minAcidentes = cidade1.nAcidentes;
				cidadeMax = cidade1.codigo;
				cidadeMin = cidade1.codigo;
			}
			if (i == 1) {
				cidade2.codigo = random.nextInt(2000);
				System.out.println("Cidade de codigo # "+cidade2.codigo);
				System.out.printf("Insira o número de Carros: ");
				cidade2.nCarros = leitor.nextInt();
				System.out.printf("Insira o número de Acidentes: ");
				cidade2.nAcidentes = leitor.nextInt();
				System.out.println("");
				
				if (cidade2.nAcidentes > maxAcidentes) {
					maxAcidentes = cidade2.nAcidentes;
					cidadeMax = cidade2.codigo;
					
				}
				if (cidade2.nAcidentes < minAcidentes) {
					minAcidentes = cidade2.nAcidentes;
					cidadeMin = cidade2.codigo;
				}
			}
			if (i == 2) {
				cidade3.codigo = random.nextInt(2000);
				System.out.println("Cidade de codigo # "+cidade3.codigo);
				System.out.printf("Insira o número de Carros: ");
				cidade3.nCarros = leitor.nextInt();
				System.out.printf("Insira o número de Acidentes: ");
				cidade3.nAcidentes = leitor.nextInt();
				System.out.println("");
				
				if (cidade3.nAcidentes > maxAcidentes) {
					maxAcidentes = cidade3.nAcidentes;
					cidadeMax = cidade3.codigo;
				}
				if (cidade3.nAcidentes < minAcidentes) {
					minAcidentes = cidade3.nAcidentes;
					cidadeMin = cidade3.codigo;
				}
			}
			if (i == 3) {
				cidade4.codigo = random.nextInt(2000);
				System.out.println("Cidade de codigo # "+cidade4.codigo);
				System.out.printf("Insira o número de Carros: ");
				cidade4.nCarros = leitor.nextInt();
				System.out.printf("Insira o número de Acidentes: ");
				cidade4.nAcidentes = leitor.nextInt();
				System.out.println("");
				
				if (cidade4.nAcidentes > maxAcidentes) {
					maxAcidentes = cidade4.nAcidentes;
					cidadeMax = cidade4.codigo;
				}
				if (cidade4.nAcidentes < minAcidentes) {
					minAcidentes = cidade4.nAcidentes;
					cidadeMin = cidade4.codigo;
				}
			}
			if (i == 4) {
				cidade5.codigo = random.nextInt(2000);
				System.out.println("Cidade de codigo # "+cidade5.codigo);
				System.out.printf("Insira o número de Carros: ");
				cidade5.nCarros = leitor.nextInt();
				System.out.printf("Insira o número de Acidentes: ");
				cidade5.nAcidentes = leitor.nextInt();
				System.out.println("");
				
				if (cidade5.nAcidentes > maxAcidentes ) {
					maxAcidentes = cidade5.nAcidentes;
					cidadeMax = cidade5.codigo;
				}
				if (cidade4.nAcidentes < minAcidentes ) {
					minAcidentes = cidade5.nAcidentes;
					cidadeMin = cidade5.codigo;
				}
			}
			
		}
		int somaVitimas = 0;
		int contador = 0;
		//MEDIA DE ACIDENTES COM MESNOS E 2000 CARROS
		for (int j = 0; j < 5; j++) {
			if (cidade1.nCarros < 2000) {
				somaVitimas =+ cidade1.nAcidentes;
				contador ++;
			}
			if (cidade2.nCarros < 2000) {
				somaVitimas =+ cidade2.nAcidentes;
				contador ++;
			}
			if (cidade3.nCarros < 2000) {
				somaVitimas =+ cidade3.nAcidentes;
				contador ++;
			}
			if (cidade3.nCarros < 2000) {
				somaVitimas =+ cidade3.nAcidentes;
				contador ++;
			}
			if (cidade4.nCarros < 2000) {
				somaVitimas =+ cidade4.nAcidentes;
				contador ++;
			}
			if (cidade5.nCarros < 2000) {
				somaVitimas =+ cidade5.nAcidentes;
				contador ++;
			}
		}
		
		
		
		//MEDIA DE VEICULOS
		int mediaVeiculos = (cidade1.nCarros + cidade2.nCarros + cidade3.nCarros + cidade4.nCarros + cidade5.nCarros)/ 5;
		
		
		System.out.println("A cidade com menor acidentes foi a # "+ cidadeMin+", com "+minAcidentes+" vitimas");
		System.out.println("A cidade com maior acidentes foi a # "+ cidadeMax+", com "+maxAcidentes+" vitimas");
		System.out.println("");
		System.out.println("A média de veiculos de todas as Cidades é "+ mediaVeiculos);
		System.out.println("Media de Acidentes com menos de 2000 carros por cidade é: "+(somaVitimas / contador));
		
		
	
		
		leitor.close();

	}

}
