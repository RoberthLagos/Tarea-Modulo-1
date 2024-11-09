

public class EvaluacionDeExpreciones {
    public static void main(String[] args) {
        int M = 6;
        int T = 1;
        int K = -10;

        boolean Expr1 = M > T;
        boolean Expr2 = (T / K == -5);
        boolean Expr3 = (M + T == 7) || (M - T == 5);

        System.out.println("Evaluacion de expresiones:");
        System.out.println("1. M > T: " + Expr1);                  
        System.out.println("2. T / K == -5: " + Expr2);            
        System.out.println("3. (M + T == 7) || (M - T == 5): " + Expr3); 
    }
}
