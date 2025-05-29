package metododepasomultiple;

public class MetodoDePasoMultiple {
    public static void main(String[] args) {
        double h = 0.2;
        double[] x = {0, 0.2, 0.4};
        double[] y = new double[3];
        y[0] = 1;

        // Primer valor por Euler
        y[1] = y[0] + h * (x[0] + y[0]);

        // Adams-Bashforth 2 pasos
        y[2] = y[1] + (h / 2) * (3 * (x[1] + y[1]) - (x[0] + y[0]));

        System.out.println("Método de paso múltiple (Adams-Bashforth): y(0.4) ≈ " + y[2]);
    }
    
}
