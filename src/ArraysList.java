import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Double> mediaTemps = new ArrayList<Double>();
        Scanner temp = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Digite a temperatura do dia: ");
            mediaTemps.add(i, temp.nextDouble());
        }
        System.out.println(mediaTemps);

        System.out.print("Digite o elemento que deseja buscar: ");
        Double busca = temp.nextDouble();

        if (mediaTemps.contains(busca) == true){
            System.out.println("Existe!");
        } else {
            System.out.println("Não existe!");
        }

        int pos = mediaTemps.indexOf(busca);
        if (pos >= 0){
            System.out.println("Elemento na posição: " + pos);
        } else {
            System.out.println("Não existe no array!");
        }

        System.out.print("Digite a posição que deseja buscar: ");
        int posicao = temp.nextInt();

        if (posicao > mediaTemps.size()){
            System.out.println("Não existe!");
        } else {
            System.out.println(mediaTemps.get(posicao));
        }

        System.out.print("Digite a posição que deseja excluir do vetor: ");
        posicao = temp.nextInt();
        mediaTemps.remove(posicao);

        System.out.println(mediaTemps);

    }
}
