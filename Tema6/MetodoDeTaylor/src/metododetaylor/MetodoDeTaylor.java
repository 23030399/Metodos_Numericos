package metododetaylor;

public class MetodoDeTaylor {
    public static void main(String[] args) {
        double x = 0, y = 1, h = 0.2;
        double xf = 0.4;

        // Derivadas: f = x + y, f' = 1 + dy/dx = 1 + x + y
        while (x < xf) {
            double f = x + y;
            double df = 1 + x + y;
            y = y + h * f + (h * h / 2) * df;
            x = x + h;
        }

        System.out.println("Método de Taylor 2do orden: y(" + xf + ") ≈ " + y);
    }
    
}
