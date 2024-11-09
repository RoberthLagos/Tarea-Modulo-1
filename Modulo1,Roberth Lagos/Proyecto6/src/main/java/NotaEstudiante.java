

import java.util.Scanner;

public class NotaEstudiante {


    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String Resultado, Nombre;
        int Nota;
        
        
        System.out.print("Ingrese el Nombre del estudiante: ");
        Nombre = lectura.nextLine();

        System.out.print("Ingrese Su Nota: ");
        Nota = lectura.nextInt();

        
        if (Nota >= 70) {
            Resultado = "Usted a Aprobado";
        } else {
            Resultado = "Usted a Reprobado";
        }

        System.out.println(" ESTUDIANTE: " + Nombre + ", Su Nota es " + Nota + "% " + Resultado);

        lectura.close();
    }
}
