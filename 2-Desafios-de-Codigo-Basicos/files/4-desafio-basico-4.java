import java.util.*;

public class Desafio {
	// Método criado para retorno da String referente ao número lido
	public static void exibirString(int numero) {
		if(numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (numero % 3 == 0) {
			System.out.println("Fizz");
		} else if (numero % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(numero);
		}
	}
	
	public static void main(String[] args) {
		// Criação do objeto da classe Scanner para leitura dos dados
		Scanner number = new Scanner(System.in);
		
		System.out.println("Por favor, digite um número: ");
		int num = number.nextInt();
		
		// Invocação do método exibirString() para impressão da string referente ao número lido
		exibirString(num);
	}
}