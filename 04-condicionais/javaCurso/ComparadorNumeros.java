package javaCurso;

import java.util.Scanner;

public class ComparadorNumeros {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	// Solicita ao usuário o primeiro número
	System.out.print("Digite o primeiro número carol: ");
	double numero1 = scanner.nextDouble();
	
	// Solicita ao usuario o segundo número
	System.out.print("Digite o segundo número gisele: ");
	double numero2 = scanner.nextDouble();
	
	// Compara os dois números e exibe o maior
	if (numero1 > numero2) { 
		System.out.println("O maior número é: " + numero1);
	}else if (numero2 > numero1) { 
		System.out.println("O maior número é: " + numero2);
	}else {
		System.out.println("Os dois números são iguais. ");
		
	}
}
}

	
	
	