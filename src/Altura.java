import static com.sun.javafx.fxml.expression.Expression.or;

public class Altura {
    public static void main(String[] args) {
        double alturaA = 1.98;
        double alturaB = 1.44;

        if (alturaA > alturaB){
            System.out.println("Mais alto é Altura A: " + alturaA);
        } else {
            System.out.println("Mais alto é Altura B: " + alturaB);
        }

        if (alturaA < 1.50){
            System.out.println("Baixinho!!");
        } else if (alturaB < 1.50){
            System.out.println("Baixinho!!!");
        }
    }
}
