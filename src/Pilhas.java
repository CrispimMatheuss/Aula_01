import java.util.Scanner;
import java.util.Stack;

public class Pilhas {
    public static void main(String[] args) {
        Stack<Integer> duracell = new Stack<Integer>();
        Scanner s = new Scanner(System.in);

        duracell.add(5);
        duracell.add(98);
        duracell.add(7);
        duracell.add(99);

            int opcao = 0;

            System.out.println("Selecione a operação: ");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Verificar se está vazia");
            System.out.println("4 - Verificar tamanho da pilha");
            System.out.println("5 - Mostrar ultimo elemento");
            System.out.print("Selecione: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número para adicionar: ");
                    duracell.add(s.nextInt());
                    break;

                case 2:
                    duracell.pop();
                    break;

                case 3:
                    if (duracell.isEmpty()) {
                        System.out.println("Vazio");
                    } else {
                        System.out.println("Com dados");
                    }
                    break;

                case 4:
                    System.out.println(duracell.size());
                    break;

                case 5:
                    System.out.println(duracell.peek());
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
}
