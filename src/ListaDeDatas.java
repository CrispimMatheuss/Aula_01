import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaDeDatas {
    public static void main(String[] args) {
        List<LocalDate> lista = new ArrayList<>();

        lista.add(LocalDate.of(1995, 7, 29));
        lista.add(LocalDate.of(2001, 8, 30));
        lista.add(LocalDate.of(1983, 1, 28));
        lista.add(LocalDate.of(1990, 8, 2));
        lista.add(LocalDate.of(2004, 1, 17));
        lista.add(LocalDate.of(1995, 6, 27));
        lista.add(LocalDate.of(1997, 3, 7));
        lista.add(LocalDate.of(2002, 8, 18));
        lista.add(LocalDate.of(2000, 2, 2));
        lista.add(LocalDate.of(1994, 3, 16));

        LocalDate nasceuPrimeiro = null;
        LocalDate nasceuPorUltimo = null;
        LocalDate diaDeHoje = LocalDate.now();

        for (int i = 0; i < lista.size(); i++){
            if (i == 0){
                nasceuPrimeiro = lista.get(i);
                nasceuPorUltimo = lista.get(i);
            }

            if (i > 0){
                if (nasceuPrimeiro.isAfter(lista.get(i))){
                    nasceuPrimeiro = lista.get(i);
                }

                if (nasceuPorUltimo.isBefore(lista.get(i))){
                    nasceuPorUltimo = lista.get(i);
                }
            }

            System.out.println("Nascido em: " + lista.get(i) + " - Hoje tem: " + diaDeHoje.until(lista.get(i)));

        }

        System.out.println("Mais velho: " + nasceuPrimeiro);
        System.out.println("Mais novo: " + nasceuPorUltimo);

    }
}
