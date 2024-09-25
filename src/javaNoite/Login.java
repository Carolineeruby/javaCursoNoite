package javaNoite;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// variaveis fixas de nome de usuario e senha
		String usuarioCorreto = "admin";
		String senhaCorreta = "123";

		// Número máximo de tentativas:
		int tentativasMaximas = 3;
		int tentativas = 0; // contador de tentativas

		// Entradas do usuario:
		Scanner scanner = new Scanner(System.in);

		// tentativa de login 01:
		System.out.println("Digite oo nome do usuário: ");
		String usuario = scanner.nextLine();

		System.out.println("Digite a senha: ");
		String senha = scanner.nextLine();

		if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
			System.out.println("login realizado com sucesso! Bem-Vindo.");
		} else {
			// tentativas = tentativas + 1;
			tentativas++;// mesma coisa que a linha de cima!
			System.out.println("Usuario ou senha incorretos, tente novamente!");

			// tentativa de login 02:
			System.out.println("Digite o nome do usuário: ");
			usuario = scanner.nextLine();

			if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
				System.out.println("Longin realizado com sucesso! Bem-Vindo.");
			} else {
				tentativas++;
				System.out.println("Usuario ou senha incorretos, tente novamente!");

				// Tentativa final:
				System.out.println("tentativa final, seu login será bloqueado: ");
				System.out.println("Digite oo nome do usuário: ");
				usuario = scanner.nextLine();

				System.out.println("Digite a senha: ");
				senha = scanner.nextLine();

				if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
				} else {
					tentativas++;
					System.out.println("AcessoBloqueado após 3 tentativas erradas!");
				}
			}
		}
		// fechar o scanner
		scanner.close();
	}
}
