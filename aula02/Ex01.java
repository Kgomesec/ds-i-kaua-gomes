import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();

        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras '" + palavra1 + "' e '" + palavra2 + "' são iguais");
        } 
        else {
            System.out.println("As palavras '" + palavra1 + "' e '" + palavra2 + "' são diferentes");
        }

        scanner.close();
    }
}
