
import java.util.Scanner;


public class OperacionesAritmeticas {


    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float Num1,Num2,Suma,Resta,Mul,Div,Mod;
        System.out.println("Por favor ingrese el primer numero:");
        Num1=entrada.nextFloat();
        System.out.println("Por favor ingrese el segundo numero:");
        Num2=entrada.nextFloat();
        
        Suma  = Num1+Num2;
        Resta = Num1-Num2;
        Mul   = Num1*Num2;
        Div   = Num1/Num2;
        Mod   = Num1%Num2;
        
        System.out.println("La suma es: " + Suma);
        System.out.println("La Resta es: " + Resta);
        System.out.println("La Multiplicacion es: " + Mul);
        System.out.println("La Divicion es: " + Div);
        System.out.println("El residuo (mod) es: " + Mod); 
       
        
    }
}
