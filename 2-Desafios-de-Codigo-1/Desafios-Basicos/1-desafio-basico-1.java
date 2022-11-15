import java.util.*;

public class Desafio {

	public static void main(String[] args) {	
		// Declaração das variáveis
		int numero1, numero2;
		
		// Criação do objeto da classe Scanner para leitura dos dados
		Scanner leitor = new Scanner(System.in);
	 
		System.out.print("Por favor, digite o primeiro número: ");
		numero1 = leitor.nextInt();
	 
		System.out.print("Digite agora o segundo número: ");
		numero2 = leitor.nextInt();
		
		// Criação da estrutura if ... else para determinação de se os números são iguais ou não
		if(numero1 == numero2) {
			System.out.print("São iguais!");
		} else {
			System.out.print("Não são iguais!");
		}
    }
}