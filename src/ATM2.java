import java.util.Scanner;

public class ATM2 {
    public static void main(String[] args) {
        int[] cedulas = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] qtdCedula = {0, 0, 0, 10, 2, 1, 1, 1};
        int valorReais = 0;
        int qtdeAtm = 0;
        int qtdRetirada = 0;
        int valorSacado = 0;
        int quantidadeCedulas = 0;
        boolean sacou = false;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        valorReais = Integer.parseInt(s.nextLine());


        for (int i = 0; i < qtdCedula.length; i++) {
            qtdeAtm += qtdCedula[i] * cedulas[i];
        }

        if (valorReais > qtdeAtm) {
            System.out.println("Saldo indisponível no caixa!");
        } else {

            for (int i = 0; i < cedulas.length; i++) {
                quantidadeCedulas = valorReais / cedulas[i];
                qtdRetirada = 0;
                valorSacado = 0;
                sacou = false;

                if (valorReais > 0 && valorReais >= cedulas[i]) {

                    while (qtdCedula[i] > 0 && quantidadeCedulas != qtdRetirada) {
                        qtdRetirada++;
                        qtdCedula[i] -= 1;
                        valorSacado += 1 * cedulas[i];
                        sacou = true;
                    }
                    if (sacou) {
                        valorReais -= valorSacado;
                        System.out.println("Quantidade de cedulas de " + cedulas[i] + ": " + qtdRetirada);
                    }
                }

            }
        }
    }
}

