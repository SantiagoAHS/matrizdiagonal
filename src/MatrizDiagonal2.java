import java.util.Scanner;

public class MatrizDiagonal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Construir Matriz Diagonal");
            System.out.println("2. Construir Bidiagonal Superior");
            System.out.println("3. Construir Bidiagonal Inferior");
            System.out.println("4. Construir Matriz Tridiagonal");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    construirMatrizDiagonal(scanner);
                    break;
                case 2:
                    construirBidiagonalSuperior(scanner);
                    break;
                case 3:
                    construirBidiagonalInferior(scanner);
                    break;
                case 4:
                    construirMatrizTridiagonal(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    // Construye una matriz diagonal con valores ingresados por el usuario.
    private static void construirMatrizDiagonal(Scanner scanner) {
        System.out.println("Ingrese el tamaño de la matriz diagonal:");
        int n = scanner.nextInt();
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

        System.out.println("Matriz Diagonal:");
        imprimirMatriz(matriz);
    }

    // Construye una matriz bidiagonal superior con valores ingresados por el usuario.
    private static void construirBidiagonalSuperior(Scanner scanner) {
        System.out.println("Ingrese el tamaño de la matriz bidiagonal superior:");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                matriz[i][j] = ingresarValorEnPosicion(i, j, scanner);
            }
        }

        System.out.println("Matriz Bidiagonal Superior:");
        imprimirMatriz(matriz);
    }

    // Construye una matriz bidiagonal inferior con valores ingresados por el usuario.
    private static void construirBidiagonalInferior(Scanner scanner) {
        System.out.println("Ingrese el tamaño de la matriz bidiagonal inferior:");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = ingresarValorEnPosicion(i, j, scanner);
            }
        }

        System.out.println("Matriz Bidiagonal Inferior:");
        imprimirMatriz(matriz);
    }

    // Construye una matriz tridiagonal con valores ingresados por el usuario.
    private static void construirMatrizTridiagonal(Scanner scanner) {
        System.out.println("Ingrese el tamaño de la matriz tridiagonal:");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j <= i + 1; j++) {
                if (j >= 0 && j < n) {
                    matriz[i][j] = ingresarValorEnPosicion(i, j, scanner);
                }
            }
        }

        System.out.println("Matriz Tridiagonal:");
        imprimirMatriz(matriz);
    }

    // Ingresa un valor en una posición específica de la matriz.
    private static int ingresarValorEnPosicion(int fila, int columna, Scanner scanner) {
        System.out.println("Ingrese el valor para la posición (" + (fila + 1) + ", " + (columna + 1) + "):");
        return scanner.nextInt();
    }

    // Imprime una matriz.
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}
