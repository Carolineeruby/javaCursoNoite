package jurosCompostos;

import java.util.Scanner;

public class jurosCompostos {

	public static void main(String[] args) {
		// Instanciando o scanner para usa-lo:
		java.util.Scanner sc = new Scanner(System.in);

		// Pegar dados dos usuarios
		// Capturando o capital
		System.out.println("Digite o capital: ");
		double capital = sc.nextDouble();
		// Capturando a taxa de juros:
		System.out.println("Digite a taxa de juros anual: ");
		double taxa = sc.nextDouble();
		// Pegar o tempo da aplicação:
		System.out.println("Digite o tempo: ");
		int tempo = sc.nextInt();

		// Calculo dos juros compostos(anual):
		double montante = capital * Math.pow(1 + (taxa / 100), tempo);
		double juros = montante - capital;
		
	//Resultados:
		System.out.println("O valor do juros compostos é: " + juros);
		System.out.println("O valor total(principal + juros) é: " + montante);
		
		sc.close();
		
		

	}

}
