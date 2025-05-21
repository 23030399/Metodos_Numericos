package biseccion;
public class Biseccion {
    // Función: f(x) = x^3 - x - 2
    public static double f(double x) {
        return x * x * x - x - 2;
    }

    public static void main(String[] args) {
        // Intervalo inicial [a, b]
        double a = 1.0, b = 2.0;
        double tol = 1e-6; // Tolerancia
        double maxIter = 100; // Máximo de iteraciones
        int iter = 0;
        double p, error;

        // Verificar que f(a) * f(b) < 0
        if (f(a) * f(b) >= 0) {
            System.out.println("El intervalo [a, b] no es válido.");
            return;
        }

        System.out.println("Iter\tp\t\tf(p)\t\tError");
        while (iter < maxIter) {
            // Calcular punto medio
            p = (a + b) / 2;
            error = Math.abs(b - a) / 2;

            System.out.printf("%d\t%.6f\t%.6f\t%.6f\n", iter, p, f(p), error);

            // Si el error es menor a la tolerancia, detener
            if (error < tol) {
                System.out.printf("Raíz encontrada: %.6f después de %d iteraciones\n", p, iter);
                break;
            }

            // Seleccionar subintervalo
            if (f(p) * f(a) < 0) {
                b = p; // La raíz está en [a, p]
            } else {
                a = p; // La raíz está en [p, b]
            }
            iter++;
        }

        if (iter >= maxIter) {
            System.out.println("El método no convergió en el número máximo de iteraciones.");
        }
    }
}
