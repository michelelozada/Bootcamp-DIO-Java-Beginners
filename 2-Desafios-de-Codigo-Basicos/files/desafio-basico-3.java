import java.util.*;

public class Main {
	
    // Método criado para retorno do somatório
    public static int somarNumeros(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somarNumeros(numero - 1);
        }
    }

    public static void main(String[] args) {
        // Criação do objeto da classe Scanner para leitura dos dados
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite um número: ");
        int N = leitor.nextInt();

        // Invocação do método somarNumeros() para soma dos números do intervalo
        System.out.println("Resposta: O somatório de " + N + " até 0: " + somarNumeros(N));
    } 
}