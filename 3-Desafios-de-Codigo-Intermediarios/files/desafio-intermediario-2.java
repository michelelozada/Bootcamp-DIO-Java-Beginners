import java.util.*;

public class Main {

    // Criação do método para validação da string, de acordo com as características especificadas
    public static boolean verificarFormato(String caractere) {

        // Partição da string lida em caracteres armazenados em um array
        String[] caracteresLidos = caractere.split("");

        // Criação de um array que armazena as aberturas e fechamentos válidos
        String[] caracteresParaTeste = {"(", ")", "{", "}", "[", "]"};

        // Criação de estrutura for para percorrer o array com as aberturas e fechamentos válidos
        for(int i = 0; i < caracteresParaTeste.length; i++){
            // Criação da estrutura if para verificação de se tais caracteres de abertura e fechamento das strings correspondem ao desejado
                if (caracteresLidos[0].equals(caracteresParaTeste[i]) && caracteresLidos[caracteresLidos.length - 1].equals(caracteresParaTeste[i + 1])){
                    return true;
                }    
        }
        return false;
    }

    // Método principal
    public static void main(String[] args) {
        System.out.print("Por favor, digite uma String para verificação: ");

        // Criação do objeto Scanner
        Scanner leitor = new Scanner(System.in);

        // Invocação do método para verificação do formato da string
        boolean caracter = verificarFormato(leitor.nextLine());

        // Impressão do resultado
        System.out.println(">> A verificação para esta string retornou: " + caracter);
    }
}