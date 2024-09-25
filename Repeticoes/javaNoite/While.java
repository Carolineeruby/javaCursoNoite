package javaNoite;

public class While {

	public static void main(String[] args) {
		// criando variavel comecando do zero:
		int contador = 0; 
		while( contador <= 10 ) {
			System.out.println(contador +"");
			//contador = contador +1; incrementa a variavel, aumenta o valor. (Modo 01)é igual 
			contador ++; //faz a linha de cima!(Modo 02)
			//3) contador += 1; (Modo 03)
		}

	}

}
