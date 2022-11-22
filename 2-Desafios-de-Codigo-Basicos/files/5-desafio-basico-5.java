import java.util.*;

public class Desafio {
	// Método criado para retorno da posição em que se encontra o número lido
	public static int descobrirPosicao(int numeroLido, int[] elementos) {
		int posicaoNoArray = -1;
	    for (int i = 0; i < elementos.length; i++) {
			if(numeroLido == elementos[i]){
				posicaoNoArray = i;
			}
		}
	    return posicaoNoArray;
	}
	   
	public static void main(String[] args) {
		// Criação do objeto da classe Scanner para leitura dos dados
		Scanner leitor = new Scanner(System.in);
	    
		System.out.println("Qual número deseja que eu informe se está (ou não) no array? ");
		int numeroLido = leitor.nextInt();
		
		// Criação do array de números 
		int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
		
		// Invocação do método que retornará a posição do número no array
		int posicaoNoArray = descobrirPosicao(numeroLido, elementos);

		// Criação da estrutura if ... else para exibição da mensagem a respeito da localização (ou não) do número lido no array
		if (posicaoNoArray == -1) {
			System.out.println("Número " + numeroLido + " não encontrado no array!");
		} else {
			System.out.println("Achei " + numeroLido + " na posição " + posicaoNoArray + " do array.");
		}
	}
}