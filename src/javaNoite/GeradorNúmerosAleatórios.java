package javaNoite;

import java.util.Random;
import java.util.Scanner;

public class GeradorNúmerosAleatórios {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Digite a quantidade de números aleatórios que quiser gerar: ");
		int quantidade = scanner.nextInt();

		System.out.print("Digite o limite máximo (numeros serão gerados entre 0 e esse número: ");
		int limiteMaximo = scanner.nextInt();

		System.out.println("Números aleatórios gerados: ");

		for (int i = 0; i < quantidade; i++) {
			int numeroAleatorio = random.nextInt(limiteMaximo);
			System.out.println(numeroAleatorio);
		}
		

	}

}
