import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        int i, aux = 0;

        // Criando um array a partir do número de posições passado
        System.out.print("Deseja criar um array de quantas posições? ");
        int numeroDePosicoes = leitor.nextInt();
        int [] numerosDoArray = new int[numeroDePosicoes];

        // Lendo os números que irão compor o array
        for (i = 0; i < numeroDePosicoes; i++) {
            System.out.print("\nDigite um número para a posição " + i + " do array: ");
            numerosDoArray[i] = leitor.nextInt();
        }

        for (i = 0; i < numeroDePosicoes; i++) {
            // Identificando números ímpares do array
            if (numerosDoArray[i] % 2 != 0){
                for (int j = (i + 1); j < numeroDePosicoes; j++){
                    // Identificando números pares do array
                    if (numerosDoArray[j] % 2 == 0) {
                        aux = numerosDoArray[i];
                        numerosDoArray[i] = numerosDoArray[j];
                        numerosDoArray[j] = aux;
                        j = numeroDePosicoes;
                    }
                }
            }
        }
        System.out.println("\nnO array com suas posições rearranjadas ficou assim:");
        for (i = 0; i < numeroDePosicoes; i++){
            System.out.println("Na posição " + i + ": " + numerosDoArray[i]);
        }
    }
}