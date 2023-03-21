import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class bigDecimal {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(2.8989);
        System.out.println(bigDecimal);

        BigDecimal subtracao = BigDecimal.valueOf(2.00).subtract(BigDecimal.valueOf(1.2));
        System.out.println(subtracao);

        BigDecimal soma = BigDecimal.valueOf(2.00).add(BigDecimal.valueOf(1.2));
        System.out.println(soma);

        BigDecimal divisao = BigDecimal.valueOf(2.00).divide(BigDecimal.valueOf(4));
        System.out.println(divisao);

        BigDecimal multiplicacao = BigDecimal.valueOf(2.00).multiply(BigDecimal.valueOf(1.2));
        System.out.println(multiplicacao);

        BigDecimal potencia = BigDecimal.valueOf(2.00).pow(5);
        System.out.println(soma);

        //Maximo

        System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

        //Minimo

        System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.5")));

        //Comparar

        System.out.println(new BigDecimal("9.00").compareTo(new BigDecimal("12")));

        //Arredondamento

        BigDecimal roundup = BigDecimal.valueOf(2.8989);
        System.out.println(bigDecimal.setScale(2, BigDecimal.ROUND_UP));

        BigDecimal rounddown = BigDecimal.valueOf(2.8989);
        System.out.println(bigDecimal.setScale(3, BigDecimal.ROUND_DOWN));

        //LocaDate e LocalDateTime

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        //Funções local date

        LocalDate dataDeHoje = LocalDate.now();

        System.out.println(dataDeHoje.isLeapYear());

        System.out.println(dataDeHoje.minusDays(3));

        System.out.println(dataDeHoje.minusMonths(2));

        System.out.println(dataDeHoje.plusDays(10));

        System.out.println(dataDeHoje.plusMonths(6));

        System.out.println(dataDeHoje.getDayOfWeek());

        LocalDate diaPgto = LocalDate.of(2022, 8, 01);
        LocalDate diaBoleto = LocalDate.of(2022,8,10);

        System.out.println(diaBoleto.isAfter(diaPgto));
        System.out.println(diaBoleto.isBefore(diaPgto));

    }
}
