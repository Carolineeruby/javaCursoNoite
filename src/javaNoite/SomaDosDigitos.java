package javaNoite;

import java.util.Scanner;

public class SomaDosDigitos {

	public static void main(String[] args) {
		Scanner scsanner = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int numero = scanner.nextInt();
		int soma = 0;

		while (numero > 0) {

			int digito = numero % 10;

			soma += digito;

			numero /= 10;

		}

		System.out.println("A soma dos digitos é: " + soma);

	}

}
