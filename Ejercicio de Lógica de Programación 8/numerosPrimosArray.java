package repofelipe;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class NumerosPrimosArray {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = scanner.nextInt();
        }

        int inicio = 0;
        int fin = numeros.length - 1;
        while (inicio < fin) {
            while (inicio < fin && esPrimo(numeros[inicio])) {
                inicio++;
            }

            while (inicio < fin && !esPrimo(numeros[fin])) {
                fin--;
            }

            if (inicio < fin) {
                int temp = numeros[inicio];
                numeros[inicio] = numeros[fin];
                numeros[fin] = temp;
            }
        }

        System.out.println("Array resultante:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}