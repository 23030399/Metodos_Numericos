package metodoeuler;

public class MetodoEuler {
    public static void main(String[] args) {
        double x = 0, y = 1, h = 0.2;
        double xf = 0.4;

        while (x < xf) {
            double f = x + y;
            y = y + h * f;
            x = x + h;
        }

        System.out.println("Método de Euler: y(" + xf + ") ≈ " + y);
    }
    
}
