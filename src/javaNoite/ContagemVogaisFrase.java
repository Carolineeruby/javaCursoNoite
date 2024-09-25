package javaNoite;

import java.util.Scanner;

public class ContagemVogaisFrase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma  frase: ");
		String frase = scanner.nextLine();
		int contagemVogais = 0;
		
		//
		frase = frase.toLowerCase();
		
		//
		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);
			
			if (caractere == 'a' || caractere == 'e' || caractere == 'i' || 
			    caractere == 'o' || caractere == 'u') {
				contagemVogais++;
				
			}
		}
		System.out.println("A contagem de vogais na frase é: " + contagemVogais);
		

	}

}
