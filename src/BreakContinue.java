public class BreakContinue {
    public static void main(String[] args) {

        int b = 0;
        boolean terminando = false;

        while(!terminando){
            b++;
            if (b % 2 != 0){
                continue;
            }
            System.out.println("Indice b: " + b);

            if (b == 20){
                break;
            }
        }
    }
}
