public class Main {
    public static void main(String[] args) {

        int idade1 = 22;
        // double -> 22.00
        double idade2 = idade1;

        // double é maior que o inteiro. A faixa de representacao dele é muito maior que o int
        // é como se estivesse tentando pegar um bloco grande e colocar dentro de uma caixa pequena
        idade1 = idade2; // Errado

        // pra resolver isso, vamos castiar:
        idade1 = (int) idade2;

        // Outro exemplo:
        char letra = 'a';
        String nome = letra;

        // Castiando:
        char letra = 'a';
        String nome = String.valueOf(letra); // transformou a letra numa string

        // string -> char:
        letra = nome.charAt(0); // A string da posicao 0 será transformada em char

        // Inteiro -> string:
        String nome2 = String.valueOf(idade1);

        // String -> inteiro
        idade1 = integer.parseInt(nome2);
    }
}