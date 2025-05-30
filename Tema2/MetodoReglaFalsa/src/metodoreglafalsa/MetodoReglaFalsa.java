package metodoreglafalsa;

public class MetodoReglaFalsa {
    public static void main(String[] args) {
        double a = 1.0; // Extremo izquierdo del intervalo
        double b = 2.0; // Extremo derecho del intervalo
        double tol = 1e-6; // Tolerancia
        int maxIter = 100; // Máximo de iteraciones
        int iter = 0;

        double fa = f(a);
        double fb = f(b);
        if (fa * fb >= 0) {
            System.out.println("El intervalo no contiene una raíz");
            return;
        }

        while (iter < maxIter) {
            double c = b - fb * (b - a) / (fb - fa); // Punto medio ponderado
            double fc = f(c);
            if (Math.abs(fc) < tol || Math.abs(b - a) < tol) {
                System.out.println("Raíz: " + c + ", Iteraciones: " + iter);
                return;
            }
            if (fa * fc < 0) {
                b = c;
                fb = fc;
            } else {
                a = c;
                fa = fc;
            }
            iter++;
        }
        System.out.println("No convergió en " + maxIter + " iteraciones");
    }

    // Función f(x) = x^3 - x - 2
    static double f(double x) {
        return x * x * x - x - 2;
    }
    
}
