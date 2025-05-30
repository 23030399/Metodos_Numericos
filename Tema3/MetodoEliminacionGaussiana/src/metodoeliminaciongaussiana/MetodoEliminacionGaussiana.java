package metodoeliminaciongaussiana;

public class MetodoEliminacionGaussiana {
    public static void main(String[] args) {
        double[][] A = {{3, 1, 1}, {2, 4, -1}, {1, 1, 5}};
        double[] b = {1, 11, 12};
        int n = b.length;
        double[] x = new double[n];

        // Eliminación hacia adelante
        for (int k = 0; k < n-1; k++) {
            for (int i = k+1; i < n; i++) {
                double factor = A[i][k] / A[k][k];
                for (int j = k; j < n; j++) {
                    A[i][j] -= factor * A[k][j];
                }
                b[i] -= factor * b[k];
            }
        }

        // Sustitución hacia atrás
        for (int i = n-1; i >= 0; i--) {
            double sum = 0;
            for (int j = i+1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }

        // Imprimir solución
        System.out.println("Solución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.6f\n", i+1, x[i]);
        }
    }
}
