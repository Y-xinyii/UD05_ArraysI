
import java.util.Scanner;

public class Ej3Ceros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];

        // Pedir 12 numeros enteros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar el array original
        System.out.println("Antes:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Mover los numeros distintos de cero al principio
        int posicion = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                numeros[posicion] = numeros[i];
                posicion++;
            }
        }

        // Rellenar las posiciones restantes con ceros
        while (posicion < numeros.length) {
            numeros[posicion] = 0;
            posicion++;
        }

        // Mostrar el array modificado
        System.out.println();
        System.out.println("Despues:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
