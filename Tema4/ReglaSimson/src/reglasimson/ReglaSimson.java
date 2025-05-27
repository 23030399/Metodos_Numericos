package reglasimson;
public class ReglaSimson {
// Función: f(x) = x^2 + 2x + 1
    public static double f(double x) {
        return x * x + 2 * x + 1;
    }

    public static void main(String[] args) {
        double a = 0.0; // Límite inferior
        double b = 2.0; // Límite superior
        int n = 10; // Número de subintervalos (debe ser par)
        
        // Verificar que n sea par
        if (n % 2 != 0) {
            System.out.println("El número de subintervalos debe ser par.");
            return;
        }

        double h = (b - a) / n; // Tamaño del subintervalo
        double suma = f(a) + f(b); // Suma inicial con f(a) y f(b)

        // Sumar 4 * f(x_i) para i impar, 2 * f(x_i) para i par
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 2 == 0) {
                suma += 2 * f(x);
            } else {
                suma += 4 * f(x);
            }
        }

        // Calcular integral
        double integral = (h / 3) * suma;

        // Imprimir resultado
        System.out.printf("Aproximación de la integral: %.6f\n", integral);
    }
}
