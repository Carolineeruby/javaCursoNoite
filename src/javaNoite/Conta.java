package javaNoite;

public class Conta {
	public static void main(String[] args) {
	
boolean statusConta = true;

if ( statusConta == true ) {
	System.out.println("conta ativada");
} else {
	}
System.out.println("conta desativada, "
		+ " fale com o administrador!");
	}

}

package javaNoite;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor para inicializar a conta com o titular e saldo inicial
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    // Método para verificar o saldo da conta
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        exibirSaldo();
    }

    public static void main(String[] args) {
        // Criando uma nova conta
        ContaBancaria conta = new ContaBancaria("João da Silva", 500.00);

        // Exibindo informações iniciais
        conta.exibirInformacoes();

        // Realizando operações
        conta.depositar(200.00);
        conta.sacar(100.00);
        conta.sacar(700.00); // Tentativa de saque maior do que o saldo
        conta.exibirSaldo();
    }
    
    
    
    
   package SalaTurmaInfantil;
   
   public class IngLêsTarde {
	   public static void main({[Content] args) {
		   this.ArquivoPrivado
		   
		   boolean StatusAula = in progress;
		   
		  if (Primeiraetapa == Aulainicial)
			  System.out.println("conta ativada");
		  
	   } else {
		   System.out.println("conta desativada, "
				   + "fale com o administrador!");
	   }
   }