package javaNoite;

import java.util.Scanner;

public class CalcDesconto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor original do prolduto: R$ ");
		double valorOriginal = scanner.nextDouble();

		System.out.print("Digite a porcentagem de desconto: ");
		double percentualDesconto = scanner.nextDouble();

		double valorDesconto = valorOriginal * (percentualDesconto / 100);
		double valorFinal = valorOriginal - valorDesconto;

		System.out.printf("Valor do desconto: R$ %.2f%n", valorFinal);
		System.out.printf("Valor final após desconto: R$ %.2f%n", valorFinal);

	}

}
