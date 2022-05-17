package exerciciosPOO;

import java.util.Scanner;

import org.graalvm.compiler.hotspot.aarch64.AArch64HotSpotReturnOp;

public class Empresa {

	public static void main(String[] args) {
		// OBJETOS
		Scanner leitor = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		boolean teste = true; // so pra sair amsg de erro

		
		System.out.printf("===================== EMPRESA XYZ =====================");
		
		
		do {
			System.out.printf("Matricula: #%2d \n", funcionario.contador);
			
			// RECEBIMENTO DE VALORES DO ATRIBUTO NOME
			System.out.printf("Nome do Funcionário: ");
			funcionario.nome = leitor.nextLine();
			
			funcionario.turno = turno();
			
			
			
			
			
			
			
			
		} while (teste);

		leitor.close();
	}

}
