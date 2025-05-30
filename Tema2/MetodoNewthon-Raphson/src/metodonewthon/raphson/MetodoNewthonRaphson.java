package metodonewthon.raphson;

public class MetodoNewthonRaphson {
    public static void main(String[] args) {
        double x = 1.5; // Aproximación inicial
        double tol = 1e-6; // Tolerancia
        int maxIter = 100; // Máximo de iteraciones
        int iter = 0;

        while (iter < maxIter) {
            double fx = f(x);
            double dfx = df(x); // Derivada
            if (Math.abs(fx) < tol) {
                System.out.println("Raíz: " + x + ", Iteraciones: " + iter);
                return;
            }
            if (Math.abs(dfx) < 1e-10) {
                System.out.println("Derivada demasiado pequeña");
                return;
            }
            x = x - fx / dfx;
            iter++;
        }
        System.out.println("No convergió en " + maxIter + " iteraciones");
    }

    // Función f(x) = x^3 - x - 2
    static double f(double x) {
        return x * x * x - x - 2;
    }

    // Derivada f'(x) = 3x^2 - 1
    static double df(double x) {
        return 3 * x * x - 1;
    }
    
}
