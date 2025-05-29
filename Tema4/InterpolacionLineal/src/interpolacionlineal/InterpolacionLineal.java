package interpolacionlineal;
public class InterpolacionLineal {
    public static void main(String[] args) {
        double x0 = 2, y0 = 4;
        double x1 = 6, y1 = 8;
        double x = 4; // Valor a interpolar

        double y = y0 + (x - x0) * (y1 - y0) / (x1 - x0);

        System.out.println("Interpolación lineal: y(" + x + ") = " + y);
    }
    
}
