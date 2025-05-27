package metodo.del.trapecio;

public class MetodoDelTrapecio {
    public static double f(double x) {
        return x * x + 2 * x + 1;
    }
    public static void main(String[] args) {
        double a = 0.0;
        double b = 2.0;
        int n = 10;
        double h = (b - a) / n;
        double suma = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            suma += 2 * f(x);
        }
        double integral = (h / 2) * suma;
        System.out.printf("Aproximación de la integral: %.6f\n", integral);
    }
    
}
