package metodorungekutta;

public class MetodoRungeKutta {
    public static void main(String[] args) {
        double x = 0, y = 1, h = 0.2;
        double xf = 0.4;

        while (x < xf) {
            double k1 = h * (x + y);
            double k2 = h * (x + h / 2 + (y + k1 / 2));
            double k3 = h * (x + h / 2 + (y + k2 / 2));
            double k4 = h * (x + h + (y + k3));

            y = y + (k1 + 2 * k2 + 2 * k3 + k4) / 6;
            x = x + h;
        }

        System.out.println("Runge-Kutta 4to orden: y(" + xf + ") ≈ " + y);
    }
    
}
