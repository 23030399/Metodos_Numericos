package metodopuntofijo;

public class MetodoPuntoFijo {
    public static void main(String[] args) {
        double x0 = 1.5; // Aproximación inicial
        double tol = 1e-6; // Tolerancia
        int maxIter = 100; // Máximo de iteraciones
        double x = x0;
        int iter = 0;

        while (iter < maxIter) {
            double xNext = g(x); // g(x) = (x^3 - 2)^(1/3)
            if (Math.abs(xNext - x) < tol) {
                System.out.println("Raíz: " + xNext + ", Iteraciones: " + iter);
                return;
            }
            x = xNext;
            iter++;
        }
        System.out.println("No convergió en " + maxIter + " iteraciones");
    }

    // Función g(x) para punto fijo, derivada de f(x) = x^3 - x - 2 = 0
    static double g(double x) {
        return Math.cbrt(x + 2);
    }
    
}
