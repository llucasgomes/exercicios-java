package exerciciosFOR;



//1. Estruturas condicionais e de repetição: Aumento salarial (FOR)

public class Exercicio01 {

	public static void main(String[] args) {
		
		double salario = 1000;
		double percentual = 0.015;
		
		
		for (int i = 2000; i <= 2007; i++) {
			if (i==2000) {
				System.out.printf("Foi contratado no ano de %d com salario de R$ %.2f \n",2000,salario);
			}
			if (i == 2001) {
				
				double salarioF = salario + (salario * percentual);
				System.out.printf("Neste  ano %d seu salario aumentou em %.2f %% ,\n ficando com salario de R$ %.2f \n\n",i,percentual*100,salarioF);
			}
			if (i > 2001) {
				percentual = percentual *2;
				double salarioF = salario + (salario * percentual);
				System.out.printf("Neste ano %d seu salario aumentou em %.0f %% ,\n ficando com salario de R$ %.2f \n\n",i,percentual*100,salarioF);
			}
			

		}

	}

}
