package ManipulandoStrings;

public class ManipulandoStrings {

	public static void main(String[] args) {
		// Criando Strings
		String texto = "Bem vindo ao Curso Intermediário de Java";
		String texto2 = "Vamos aprender sobre strings!";

		// 1.Comprimento da strings:
		// System.out.println("Cumprimento da string: " + texto.length());

		// 2.Concatenar String:
		// String textoCompleto = texto + texto2;
		String textoCompleto = texto + texto2;
		// System.out.println("Texto Completo: "+textoCompleto);

		// 3.Converter para MAIÚSCULAS E minúsculas:
		// System.out.println("MAIÚCULAS: "+ texto.toUpperCase());
		// System.out.println("minúsculo: "+ texto.toLowerCase());

		// 4.Substituir uma parte da string:
		String novoTexto = texto.replace("Java", "PHP");
		System.out.println("Texto após a substituição: " + novoTexto);

		// 5.Buscar por uma Substring:
		int posicao = texto.indexOf("Curso");
		System.out.println("Posição da palavra 'curso': " + posicao);

		// 6.Verificar se uma string começa ou termina com uma string:
		System.out.println("Começa com 'Bem': " + texto.startsWith("Bem"));

		// 7.Dividir uma sttring:
//		String nomeCompleto = "Caroline Ferreira Costa";
//		String[] parteDoNomeCompleto = nomeCompleto.split(" ");
//		System.out.println("Parte do Nome completo: ");
//		for (String parteDoNome : parteDoNomeCompleto ) {
//			System.out.println(parteDoNome);

		// }

		// 8. Remover espaços:
		String textosComEspacos = "    Texto com espaços.    ";

		System.out.println("Texto sem espaços: '" + textosComEspacos.trim().replaceAll("\\s+", " ") + "'");
		// o comando: "\\s+ " => captura todos os espaços da string
		// o comando " " => substitui todos os espaços por apenas 1.
				
				
	
		
		
						        
		        
		
		
		
		
				

	}

}
