package interpolacionpolinomica;

public class InterpolacionPolinomica {
    public static void main(String[] args) {
        double[] x = {1, 2, 4};
        double[] y = {1, 4, 2};
        double xp = 3; // Punto a interpolar

        double yp = 0;
        for (int i = 0; i < x.length; i++) {
            double p = 1;
            for (int j = 0; j < x.length; j++) {
                if (i != j) {
                    p *= (xp - x[j]) / (x[i] - x[j]);
                }
            }
            yp += p * y[i];
        }

        System.out.println("Interpolación polinómica (Lagrange): y(" + xp + ") = " + yp);
    }
}
