public class ArrayysMultidimensionais {
    public static void main(String[] args) {
        String[] tiposVeiculos = {"Carros", "Motos", "Barcos"};
        String[][] marcas = {{"VW", "Audi", "BMW"},
                             {"Honda", "Yamaha", "Kawasaki"},
                             {"M1", "M2", "M3"}};
        String[][][] veiculos = {{{"Golf", "Gol", "Polo"}, {"A1", "A2", "A3"}, {"Z1", "M6", "M3"},
                                  {"CG", "Hornet", "RR"}, {"R1", "R6", "MT-06"}, {"Ninja", "Z650", "Z400"},
                                  {"L12P", "L13P", "L14P"}, {"L99P", "L98P", "L990P"}, {"L1P", "L2P", "L3P"}}};

        for (int i = 0; i < veiculos.length; i++) {
            System.out.println(tiposVeiculos[i]);
            for (int j = 0; j < veiculos[i].length; j++) {
                System.out.println(marcas[i][j]);
                for (int x = 0; x < veiculos[i][j].length; x++) {
                    System.out.println(" " + veiculos[i][j][x] + " ");
                }
                System.out.println("\n");
            }
            System.out.println("\n);");
        }
    }
}

