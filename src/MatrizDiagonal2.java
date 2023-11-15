import java.util.Scanner;

public class MatrizDiagonal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz diagonal:");
        int n = scanner.nextInt();

        // Crear matriz diagonal
        int[][] matriz = crearMatrizDiagonal(n, scanner);

        // Mostrar la matriz diagonal
        System.out.println("Matriz Diagonal:");
        imprimirMatriz(matriz);

        scanner.close();
    }

    // Función para crear la matriz diagonal con valores ingresados por el usuario
    private static int[][] crearMatrizDiagonal(int n, Scanner scanner) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = ingresarValorEnPosicion(i, j, scanner);
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        return matriz;
    }

    // Función para ingresar un valor en una posición específica de la matriz
    private static int ingresarValorEnPosicion(int fila, int columna, Scanner scanner) {
        System.out.println("Ingrese el valor para la posición (" + (fila + 1) + ", " + (columna + 1) + "):");
        return scanner.nextInt();
    }

    // Función para imprimir la matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
