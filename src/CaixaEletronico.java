public class CaixaEletronico {
    public static void main(String[] args) {
        int[] cedulas = {200, 100, 50, 20, 10, 5, 2, 1};
        int quantidadeTotal = 0;
        int valorReais = 1584;

        for (int i = 0; i < cedulas.length; i++){
            int quantidadeCedulas = valorReais / cedulas[i];
            System.out.println("Quantidade de cedulas de " + cedulas[i] + ": " + quantidadeCedulas);

            valorReais %= cedulas[i];

            quantidadeTotal += quantidadeCedulas;
        }
    }
}
