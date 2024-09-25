package javaNoite;

import java.util.Scanner;

public class InversãoString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma string: ");

		System.out.print("Digite uma string: ");
		String input = scanner.nextLine();

		String inversa = new StringBuilder(input).reverse().toString();

		System.out.println("String invertida: " + inversa);

	}

}
