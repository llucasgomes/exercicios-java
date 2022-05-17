package exerciciosPOO;

import java.util.Scanner;

public class Funcionario {
	String nome;
	int horasTrabalhadas;
	String turno;
	String categoria;
	double salarioMinimo = 450;
	double auxAlim = 0;
	int contador = 1;
	boolean x = true;
	boolean y = true;
	
	
	public String turno(Scanner leitor) {
		
		do {

			System.out.printf("Turno (M – matutino; V – vespertino; N – noturno): ");
			turno = leitor.next().toUpperCase();

			if (turno.equals("M") || turno.equals("V") || turno.equals("N")) {

				x = false;
			} else {
				System.out.printf("POW mano... Tá na cara a pergunta.. Vamos de novo... \n \n");
			}

		} while (x);
		return turno;
		
	}
	
	
	
	
	

}
