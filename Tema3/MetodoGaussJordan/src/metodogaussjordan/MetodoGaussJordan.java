package metodogaussjordan;

public class MetodoGaussJordan {
    public static void main(String[] args) {
        double[][] A = {{3, 1, 1}, {2, 4, -1}, {1, 1, 5}};
        double[] b = {1, 11, 12};
        int n = b.length;

        // Matriz aumentada
        double[][] aug = new double[n][n+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aug[i][j] = A[i][j];
            }
            aug[i][n] = b[i];
        }

        // Eliminación Gauss-Jordan
        for (int k = 0; k < n; k++) {
            double pivot = aug[k][k];
            for (int j = 0; j <= n; j++) {
                aug[k][j] /= pivot;
            }
            for (int i = 0; i < n; i++) {
                if (i != k) {
                    double factor = aug[i][k];
                    for (int j = 0; j <= n; j++) {
                        aug[i][j] -= factor * aug[k][j];
                    }
                }
            }
        }

        // Imprimir solución
        System.out.println("Solución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.6f\n", i+1, aug[i][n]);
        }
    }
}
