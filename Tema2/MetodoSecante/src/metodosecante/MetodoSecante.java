package metodosecante;

public class MetodoSecante {
    public static void main(String[] args) {
        double x0 = 1.0; // Aproximación inicial 1
        double x1 = 2.0; // Aproximación inicial 2
        double tol = 1e-6; // Tolerancia
        int maxIter = 100; // Máximo de iteraciones
        int iter = 0;

        while (iter < maxIter) {
            double fx0 = f(x0);
            double fx1 = f(x1);
            if (Math.abs(fx1) < tol) {
                System.out.println("Raíz: " + x1 + ", Iteraciones: " + iter);
                return;
            }
            double x2 = x1 - fx1 * (x1 - x0) / (fx1 - fx0);
            x0 = x1;
            x1 = x2;
            iter++;
        }
        System.out.println("No convergió en " + maxIter + " iteraciones");
    }

    // Función f(x) = x^3 - x - 2
    static double f(double x) {
        return x * x * x - x - 2;
    }
    
}
