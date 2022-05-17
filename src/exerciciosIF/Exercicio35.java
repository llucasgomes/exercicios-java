package exerciciosIF;
//35. Carro novo (IF)

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe valor que sair de Fabrica: ");
		double fabrica  = leitor.nextDouble();
		double consumidor;
		
		if (fabrica < 12000) {
			consumidor = fabrica + (fabrica*0.05); 
			System.out.println("Consimidor final sairá por R$ "+consumidor+", ISENTO de impostos");
		}else if (fabrica >= 12000 && fabrica <= 25000) {
			consumidor = fabrica + (fabrica*0.1) + (fabrica*0.15); 
			System.out.println("Consimidor final sairá por R$ "+consumidor+", COM de impostos");
		}else if (fabrica > 25000){
			consumidor = fabrica + (fabrica*0.15) + (fabrica*0.2); 
			System.out.println("Consimidor final sairá por R$ "+consumidor+", COM de impostos");
		}
		
		

		

		leitor.close();

	}

}
