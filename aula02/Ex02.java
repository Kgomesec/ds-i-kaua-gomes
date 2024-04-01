import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra que quer encontrar na frase: ");
        String palavraChave = scanner.nextLine();

        System.out.println();
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        contemPalavraChave(palavraChave, frase);
    }

    public static String contemPalavraChave(String palavraChave, String frase) {
        if (frase.contains(palavraChave)) {
            return "AAAAAAAAAAAAAAAAAAAA";
        }
        else {
            return "falfijg";
        }
    }
}
