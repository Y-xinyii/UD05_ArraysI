
import java.util.Scanner;

public class Ej5Inserta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Pedir 9 numeros ordenados de menor a mayor
        for (int i = 0; i < 9; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Pedir el nuevo numero
        System.out.print("Introduce el nuevo numero: ");
        int nuevo = sc.nextInt();

        // Buscar la posicion correcta
        int posicion = 0;

        while (posicion < 9 && numeros[posicion] < nuevo) {
            posicion++;
        }

        // Desplazar los numeros hacia la derecha
        for (int i = 9; i > posicion; i--) {
            numeros[i] = numeros[i - 1];
        }

        // Insertar el nuevo numero
        numeros[posicion] = nuevo;

        // Mostrar el array final
        System.out.println("Array final:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
