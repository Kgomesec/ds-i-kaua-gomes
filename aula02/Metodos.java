public class Metodos {
    static void meuMetodo() {
        System.out.println("Assim funciona um método");
    }

    static void meuMetodoComParametros(String nome, int idade) {
        System.out.println(nome + " tem " + idade);
    }

    public static void main(String[] args) {
        meuMetodo();
        meuMetodoComParametros("Kauã", 16);
    }
}