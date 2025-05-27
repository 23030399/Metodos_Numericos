package metodocuadraturagaussiana;

public class MetodoCuadraturaGaussiana {
// Función: f(x) = x^2 + 2x + 1
    public static double f(double x) {
        return x * x + 2 * x + 1;
    }

    public static void main(String[] args) {
        double a = 0.0; // Límite inferior
        double b = 2.0; // Límite superior
        int n = 3; // Número de puntos (Gauss-Legendre de 3 puntos)

        // Puntos y pesos para Gauss-Legendre con n=3
        double[] puntos = {-0.7745966692414834, 0.0, 0.7745966692414834};
        double[] pesos = {0.5555555555555556, 0.8888888888888888, 0.5555555555555556};

        // Transformar intervalo [a, b] a [-1, 1]
        double c1 = (b - a) / 2.0;
        double c2 = (b + a) / 2.0;
        double suma = 0.0;

        // Sumar w_i * f(x_i)
        for (int i = 0; i < n; i++) {
            double x = c1 * puntos[i] + c2;
            suma += pesos[i] * f(x);
        }

        // Calcular integral
        double integral = c1 * suma;

        // Imprimir resultado
        System.out.printf("Aproximación de la integral: %.6f\n", integral);
    }
    
}
