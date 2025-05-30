package metododejacobi;

public class MetodoDeJacobi {
    public static void main(String[] args) {
        double[][] A = {{3, 1, 1}, {2, 4, -1}, {1, 1, 5}};
        double[] b = {1, 11, 12};
        int n = b.length;
        double[] x = new double[n];
        double tol = 1e-6;
        int maxIter = 100;
        int iter = 0;

        double[] xNew = new double[n];
        while (iter < maxIter) {
            double maxError = 0;
            for (int i = 0; i < n; i++) {
                double sum = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= A[i][j] * x[j];
                    }
                }
                xNew[i] = sum / A[i][i];
                maxError = Math.max(maxError, Math.abs(xNew[i] - x[i]));
            }
            for (int i = 0; i < n; i++) {
                x[i] = xNew[i];
            }
            if (maxError < tol) {
                break;
            }
            iter++;
        }

        // Imprimir solución
        System.out.println("Solución (Iteraciones: " + iter + "):");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.6f\n", i+1, x[i]);
        }
    }
}
