import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra que quer encontrar na frase: ");
        String palavraChave = scanner.nextLine();

        System.out.println();
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String res = contemPalavraChave(palavraChave, frase);

        System.out.println();
        System.out.println(res);

        scanner.close();
    }

    public static String contemPalavraChave(String palavraChave, String frase) {
        // tirar case-sensitive
        if (frase.toLowerCase().contains(palavraChave.toLowerCase())) {
            return "A frase '" + frase + "' contem a palavra '" + palavraChave + "'";
        }
        else {
            return "A frase '" + frase + "' não contem a palavra '" + palavraChave + "'";
        }
    }
}
