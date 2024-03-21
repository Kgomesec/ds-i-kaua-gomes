import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String nome;
        double peso;
        double altura;
        String classificacao = "";

        System.out.println("Qual seu nome?");
        nome = myObj.nextLine();

        System.out.println("Informe seu peso:");
        peso = myObj.nextDouble();

        System.out.println("Informe sua altura:");
        altura = myObj.nextDouble();
        
        double imc = peso/(altura*altura);

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc <= 24.9) {
            classificacao = "Peso ideal";
        } else if (imc <= 29.9) {
            classificacao = "Acima do peso";
        } else if (imc <= 34.9) {
            classificacao = "Obesidade grau I";
        } else if (imc <= 39.9) {
            classificacao = "Obesidade grau II (severa)";
        } else if (imc >= 40) {
            classificacao = "Obesidade III (mórbida)";
        }
        
        System.out.println("O imc de " + nome + " é: IMC = " + imc + "\nClassificação: " + classificacao);
    }
}
