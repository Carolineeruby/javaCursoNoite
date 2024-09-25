package CalcJurosSimples;

      import java.util.Scanner;

public class CalcJurosSimples {
	public static void main(String[] args) {
		//instanciando a classe scanner para USÁ-LA:
		Scanner scanner = new Scanner(System.in);
		
		//Entrada dos valores 
		System.out.println("Capital a investir: ");
		double capital = scanner.nextDouble();
		
		System.out.println("Qual é a taxa de juros(%): ");
		double taxa = scanner.nextDouble();
		
		
		System.out.println("Tempo em anos: ");
		int tempo = scanner.nextInt();
		
		//Calculo dos juros simples:
		double juros = (capital * taxa * tempo)/100;
		System.out.println("O valor dos juros é: "+juros);
		
		//Resultado final:
		double total = capital + juros;
		System.out.println("Capital inicial + Juros: "+ total);
		scanner.close();

	}

}
