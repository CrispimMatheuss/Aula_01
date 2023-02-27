import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite primeiro número: ");
        int n1 = s.nextInt();

        System.out.println("Digite segundo número: ");
        int n2 = s.nextInt();
        int soma = n1 + n2;
        System.out.println("Soma: " + soma);
    }
}
