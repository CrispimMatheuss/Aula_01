public class Break {
    public static void main(String[] args) {
        boolean terminando = false;
        int a = 0;
        int b = 0;

        while(!terminando){
            a++;
            System.out.println("Indice a: " + a);
            if (a == 10){
                System.out.println("Indice a: " + a);
                break;
            }
        }
    }
}
