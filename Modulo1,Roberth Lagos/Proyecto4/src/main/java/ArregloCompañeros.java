
public class ArregloCompañeros {

    public static void main(String[] args) {
        
        String[] Nombres = new String[10];

        Nombres[0] = "GISSEL ANAHI AGUILERA GOMEZ";
        Nombres[1] = "ANDREA MICHELL ACOSTA PEREZ";
        Nombres[2] = "EROS ADRIEL BARRIERY VALERIO";
        Nombres[3] = "JUAN CARLOS CABRERA RODRIGUEZ";
        Nombres[4] = "CINTYA ALEJANDRA CASTILLO GARCIA";
        Nombres[5] = "DAVID JOSUHA MATUTE LOPEZ";
        Nombres[6] = "DIANA MICHELLE MARTINEZ PINEDA";
        Nombres[7] = "EDGAR JOEL GUZMAN RODRIGUEZ";
        Nombres[8] = "EDUARDO YASIR GUILLEN MELENDEZ";
        Nombres[9] = "KEYLA YAMILETH HERNANDEZ ALVAREZ";

       
        System.out.println("Nombres de companeros de clase:");
        for (int i = 0; i < Nombres.length; i++) {
            System.out.println((i + 1) + ". " + Nombres[i]);
        }
    }
}

