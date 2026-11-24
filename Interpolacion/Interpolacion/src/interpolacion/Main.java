package interpolacion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] x = {1.0, 2.0, 3.0, 4.0};
        double[] y = {2.0, 5.0, 10.0, 17.0};
        double xEval = 2.5;

        double valorLagrange = InterpolacionLagrange.interpolacionLagrange(x, y, xEval);

        double[][] tablaNewton = DiferenciasDivididasNewton.construirTablaDiferenciasDivididas(x, y);
        double valorNewton = DiferenciasDivididasNewton.evaluarNewton(x, tablaNewton, xEval);

        System.out.println("=== PRUEBA DE INTERPOLACIÓN ===");
        System.out.println("Nodos x: " + Arrays.toString(x));
        System.out.println("Nodos y: " + Arrays.toString(y));
        System.out.println("Punto de evaluación x = " + xEval);
        System.out.println();

        System.out.println("Resultado Lagrange: " + valorLagrange);
        System.out.println("Resultado Newton:   " + valorNewton);
        System.out.println();

        DiferenciasDivididasNewton.imprimirTablaDiferenciasDivididas(x, tablaNewton);
    }
}