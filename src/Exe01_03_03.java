import java.util.Scanner;

public class Exe01_03_03 {
    public static void main(String[] args){
        Scanner nome = new Scanner(System.in);
        Scanner snome = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String n = nome.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String s = snome.nextLine();

        System.out.println("Digite sua idade: ");
        int i = idade.nextInt();

        System.out.println("Meu nome é " + n + " " + s + " e tenho " + i + " anos.");

    }
}
