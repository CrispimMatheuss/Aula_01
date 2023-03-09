import java.util.Scanner;

public class Exe02_03_03 {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String n = nome.nextLine();

        if (n.length() < 30) {
            System.out.println("Nome curto.");
        } else {
            System.out.println("Nome longo.");
        }
    }
}
