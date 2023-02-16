import java.sql.SQLOutput;

public class Operadores {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println("########## OPERADORES ##########");
        int soma = a + b;
        System.out.println("Soma: " + soma);

        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

        int multiplicacao = a * b;
        System.out.println("Mutiplicação: " + multiplicacao);

        int divisao = a / b;
        System.out.println("Divisão: " + divisao);

        int resto = a % b;
        System.out.println("Resto: " + resto);
        System.out.println("########## OPERADORES ##########");

        System.out.println("");
        System.out.println("");

        System.out.println("########## EXPRESSÕES ##########");
        int expressao = a + b * 10;
        System.out.println("Expressão 1: " + expressao);

        int expressao2 = (a + b - a) / 10;
        System.out.println("Expressão 2: " + expressao2);
        System.out.println("########## EXPRESSÕES ##########");

    }
}
