import java.util.*;

public class Desafio {
	
	public static void main(String[] args) {
        // Declaração das variáveis
        int A, N;
        int soma = 0;
       
	   // Criação do objeto da classe Scanner para leitura dos dados
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Por favor, digite um número para o início do intervalo: ");
        A = leitor.nextInt();
        
        System.out.println("Digite agora um número para o fim do intervalo: ");
        N = leitor.nextInt();

        // Criação da estrutura for para identificação e soma dos múltiplos do número A dentro do intervalo
        for (int i = 1; i <= N; i++) {
            if(i % A == 0) {
                soma += i;
            }  
        }
        System.out.println("Resposta: A soma dos múltiplos de " + A + " até " + " B é " + soma);
    }
}