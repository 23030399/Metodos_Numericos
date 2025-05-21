package metodostema3;
public class MetodosTema3 {
    public static void main(String[] args) {
        double x = 0, y = 0, z = 2;
        double xOld, yOld;
        int iteraciones = 10;

        System.out.println("Iteración\tx\t\ty\t\tz");

        for (int i = 1; i <= iteraciones; i++) {
            xOld = x;
            yOld = y;
            x = 12 - y - z;
            y = (16.9 - 1.5 * x - 2 * z) / 1.2;

            System.out.printf("%d\t\t%.6f\t%.6f\t%.6f\n", i, x, y, z);

            if (Math.abs(x - xOld) < 0.0001 && Math.abs(y - yOld) < 0.0001) {
                break;
            }
        }

        System.out.println("\nResultado aproximado:");
        System.out.printf("x = %.4f\n", x);
        System.out.printf("y = %.4f\n", y);
        System.out.printf("z = %.4f (fijo)\n", z);
        
        
        //Seidel
//        double[][] A = {
//            {4, 1, -1},
//            {2, 5, 2},
//            {1, 2, 4}
//        };
//        double[] b = {8, 3, 11};
//        int n = A.length;
//        double[] x = new double[n];
//        double tol = 1e-6;
//        int maxIter = 100;
//        int iter = 0;
//        double error;
//
//        System.out.println("Iter\tx1\t\tx2\t\tx3\t\tError");
//        System.out.printf("%d\t%.6f\t%.6f\t%.6f\t-\n", iter, x[0], x[1], x[2]);
//
//        while (iter < maxIter) {
//            double[] x_anterior = x.clone();
//            for (int i = 0; i < n; i++) {
//                double suma = 0;
//                for (int j = 0; j < n; j++) {
//                    if (j != i) {
//                        suma += A[i][j] * x[j];
//                    }
//                }
//                x[i] = (b[i] - suma) / A[i][i];
//            }
//            error = 0;
//            for (int i = 0; i < n; i++) {
//                error = Math.max(error, Math.abs(x[i] - x_anterior[i]));
//            }
//            iter++;
//            System.out.printf("%d\t%.6f\t%.6f\t%.6f\t%.6f\n", iter, x[0], x[1], x[2], error);
//
//            if (error < tol) {
//                System.out.printf("Solución encontrada después de %d iteraciones:\n", iter);
//                for (int i = 0; i < n; i++) {
//                    System.out.printf("x%d = %.6f\n", i + 1, x[i]);
//                }
//                return;
//            }
//        }
//
//        System.out.println("El método no convergió en el número máximo de iteraciones.");
    }
    
}
