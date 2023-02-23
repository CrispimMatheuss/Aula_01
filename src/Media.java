public class Media {
    public static void main(String[] args) {
        double nota = 4.5;

        if (nota >= 7.0){
            System.out.println("Aprovado!");
            if (nota >= 9.0){
                System.out.println("Parabéns!");
            }
        } else {
            if (nota < 5){
                System.out.println("Reprovado!");
            } else {
                System.out.println("Recuperação!");
            }
        }
    }
}
