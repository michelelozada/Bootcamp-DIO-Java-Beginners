import java.util.Scanner;

public class Main {

    // Criação da função para identificação do palíndromo
    public static String identificarPalindromo(String palavra){

        // Armazenando as letras da palavra lida em um array
        String[] letrasPalavra = palavra.split("");

        // Criação da estrutura for para gerar a palavra reversa
        String palavraReversa = "";

        for(int i = (palavra.length() - 1); i >=0; i--)  {
            palavraReversa += letrasPalavra[i];
        }

        // Validação da igualdade - ou não - das duas palavras
        if(palavraReversa.equals(palavra)) {
            return "TRUE";
        } else {
        return "FALSE";
        }	
    }

    // Programa principal
    public static void main(String[] args) {
	
        // Criação do objeto Scanner
        Scanner leitor = new Scanner(System.in);

        // Leitura da string a ser analisada
        String palavra = leitor.nextLine();

        // Invocação do método para identificação do palíndromo 
        System.out.println(identificarPalindromo(palavra));
    }
}