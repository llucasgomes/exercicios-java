package exerciciosDOWHILE;

import java.util.Scanner;

//4. Estruturas condicionais e de repetição: Audiência (Do-While)

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String televisao;
		int canal4 = 0;
		int canal5 = 0;
		int canal7 = 0;
		int canal12 = 0;
		int pessoas = 0;
		double audiencia = 0;
		int contador = 1;

		do {

			System.out.print("Televisao ligada ( s/n ): ");
			televisao = leitor.next().toUpperCase();

			if (televisao.equals("S")) {
				System.out.print(contador + "ª pesquisa");
				System.out.println("");
				System.out.print("");
				System.out.printf("Quantas pessoas assitem o CANAL 4: ");
				canal4 = leitor.nextInt();
				System.out.printf("Quantas pessoas assitem o CANAL 5: ");
				canal5 = leitor.nextInt();
				System.out.printf("Quantas pessoas assitem o CANAL 7: ");
				canal7 = leitor.nextInt();
				System.out.printf("Quantas pessoas assitem o CANAL 12: ");
				canal12 = leitor.nextInt();
				System.out.println("");

				pessoas = canal12 + canal4 + canal5 + canal7;

				System.out.println("Numero de pessoas na casa: " + pessoas);
				System.out.println("========= audiência por canal ( % ) ==========");
				System.out.println("                                        ");

				audiencia = (100 / pessoas) * canal4;
				System.out.printf("              CANAL 4  - %.1f %% \n", audiencia);
				audiencia = (100 / pessoas) * canal5;
				System.out.printf("              CANAL 5  - %.1f %% \n", audiencia);
				audiencia = (100 / pessoas) * canal7;
				System.out.printf("              CANAL 7  - %.1f %% \n", audiencia);
				audiencia = (100 / pessoas) * canal12;
				System.out.printf("              CANAL 12 - %.1f %% \n", audiencia);
				System.out.println("                                        ");
				System.out.println("========================================");

			} else {
				System.out.println("Televisao desligada");
				System.out.println("Nada foi anotado");
				System.out.println("");
			}

			// PROCESSO PARA FAZER OUTRA PESQUISA
			System.out.printf("Deseja realizar outra pesquisa ( s/n ):");
			televisao = leitor.next().toUpperCase();
			if (televisao.equals("S")) {
				System.out.println("");

			} else {
				televisao = "N";
				System.out.println("");
			}

		} while (televisao.equals("S"));
		System.out.println("");
		System.out.println("PROGRAMA FINALIZADO");

		leitor.close();

	}

}
