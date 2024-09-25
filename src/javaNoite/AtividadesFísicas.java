package javaNoite;

import java.util.Scanner;

public class AtividadesFísicas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Exibe o menu de opções
		System.out.println("Escolha uma atividade fisica");
		System.out.println("1.Corrida");
		System.out.println("2.Caminhada");
		System.out.println("3.Ciclísmo");

		// Recebe e escolhe do usuário:
		int opcao = scanner.nextInt();
		int calorias = 0;
		String atividade = "";

		// Estruta switch para selecionar atividade e calcular as calorias:

		switch (opcao) {
		case 1:
			atividade = "corrida";
			calorias = 300;
			break;
		case 2:
			atividade = "Caminhada";
			calorias = 150;
			break;
		case 3:
			atividade = "Ciclismo";
			calorias = 250;
			break;
		default:
			System.out.println("Opção invalida! Tenta novamente.");
			System.exit(0);
			// o zero é quando no switch o app fecha sem erros.

			// Exibe o resultado da escolha:
			System.out.println("Você escolheu a atividade: " + atividade);
			System.out.println("Calorias queimadas em 30 min: " + " Kcal");

			// fecha o scanner:
			scanner.close();

		}

	}

}
