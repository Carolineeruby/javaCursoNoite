package javaNoite;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(Sistem.in);
		
		//Exibe os dias da semana:
		System.out.println("Escolha o dia da semana");
		System.out.println(" Dia 01.Segunda-feira");
		System.out.println(" Dia 02.Terça-feira");
		System.out.println(" Dia 03.Quarta-feira");
		System.out.println(" Dia 04.Quinta-feira");
		System.out.println(" Dia 05.Sexta-feira");
		System.out.println(" Dia 06.Sábado");
		System.out.println(" Dia 07.Domingo");
		
		//Recebe e escolhe o dia:
		int opcao = scanner.nextInt();
		int dia = (1);
		String semana = "";
		
		//Estrutura Switch para selecionar nome do dia:
		switch(opcao) {
		case 1:
			dia = 1;
			nome = "Segunda-feira";
			break;
			switch(opcao) {
			case 1:
				dia = 2;
				nome = "Terça-feira";
				break;
				switch(opcao) {
				case 1:
					dia = 3;
					nome = "Quarta-feira";
					break;
					switch(opcao) {
					case 1:
						dia = 4;
						nome = "Quinta-feira";
						break;
						switch(opcao) {
						case 1:
							dia = 5;
							nome = "Sexta-feira";
							break;
							switch(opcao) {
							case 1:
								dia = 6;
								nome = "Sábado";
								break;
								switch(opcao) {
								case 1:
									dia = 1;
									nome = "Domingo";
									break;
									
								 
			
		}
		

	}

}
