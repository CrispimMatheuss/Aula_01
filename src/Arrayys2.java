import java.util.Scanner;

public class Arrayys2 {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        String[] sobrenomes = new String[3];
        int[] qtdFilhos = new int[3];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o nome da pessoa: ");
            String nome = s.nextLine();
            nomes[i] =  nome;

            System.out.print("Digite o sobrenome da pessoa: ");
            String sobrenome = s.nextLine();
            sobrenomes[i] = sobrenome;

            System.out.print("Quantidade de filhos: ");
            int qtdFilho = Integer.parseInt(s.nextLine());
            qtdFilhos[i] = qtdFilho;
        }

        for (int i = 0; i < 3; i++){
            System.out.println("A pessoa " + nomes[i] + " " + sobrenomes[i] + " tem " + qtdFilhos[i] + " filhos!");
        }
    }

}
