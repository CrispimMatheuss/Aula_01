import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        double[] tempMedias = new double[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Digite a temperatura: ");
            tempMedias[i] = temp.nextDouble();

        }
    }
}
