
public class ArregloMultidimensional {
    
    public static void main(String[] args) {
        
         String[][] compañeros = {
            {"Eleazar", "Ruiz", " Contaduria", "   Odef Financiera"},
            {"Eddy", "Hernandez", " Electronica", "   Planta"},
            {"Roberth", "Lagos", " Ing_Computacion", "  Centro Educativo"},
            {"Zandry", "Aguilar", " Medicina", "   Hotel"},
            {"Yocelin", "Nicol", " Ing_Computacion", "  Farmacia"}
        };
        
        
     System.out.println(String.format("%-10s %-12s %-15s %-20s","Nombre", "Apellido", "Carrera", "Lugar de Trabajo"));
        System.out.println("----------------------------------------------------------");

       
        for (int i = 0; i < compañeros.length; i++) {
            // Usar formato de cadenas con longitud fija
            String nombre = String.format("%-10s", compañeros[i][0]);
            String apellido = String.format("%-12s", compañeros[i][1]);
            String carrera = String.format("%-15s", compañeros[i][2]);
            String lugarTrabajo = String.format("%-20s", compañeros[i][3]);
            System.out.println(nombre + apellido + carrera + lugarTrabajo);
        }
    }
}

        
    