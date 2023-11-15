public class MatrizDiagonal {
    public static void main(String[] args) {
        // Definir una matriz diagonal (D) y un vector (V)
        double[][] D = {
            {2, 0, 0},
            {0, 3, 0},
            {0, 0, 4}
        };
        
        double[] V = {1, 2, 3};

        // Mostrar la matriz diagonal (D)
        System.out.println("Matriz Diagonal (D):");
        imprimirMatriz(D);

        // Mostrar el vector (V)
        System.out.println("\nVector (V):");
        imprimirVector(V);

        // Realizar la multiplicación de matriz por vector
        double[] resultado = multiplicarMatrizPorVector(D, V);

        // Mostrar el resultado
        System.out.println("\nResultado (D * V):");
        imprimirVector(resultado);
    }

    public static double[] multiplicarMatrizPorVector(double[][] matriz, double[] vector) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        if (filas != columnas || columnas != vector.length) {
            throw new IllegalArgumentException("Las dimensiones de la matriz y el vector no son compatibles para la multiplicación.");
        }

        double[] resultado = new double[filas];
        
        for (int i = 0; i < filas; i++) {
            resultado[i] = 0;
            for (int j = 0; j < columnas; j++) {
                resultado[i] += matriz[i][j] * vector[j];
            }
        }
        
        return resultado;
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirVector(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
