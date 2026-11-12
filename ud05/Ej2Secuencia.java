
import java.util.Random;

public class Ej2Secuencia {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numeros = new int[20];

        // Generar 20 numeros aleatorios entre 0 y 5
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(6);
        }

        // Mostrar el array
        System.out.println("Array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        int numero = numeros[0];
        int maxRepeticiones = 1;
        int posicion = 0;
        int contador = 1;

        // Buscar la secuencia consecutiva mas larga
        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] == numeros[i - 1]) {
                contador++;
            } else {
                contador = 1;
            }

            if (contador > maxRepeticiones) {
                maxRepeticiones = contador;
                numero = numeros[i];
                posicion = i - contador + 1;
            }
        }

        // Mostrar resultados
        System.out.println();
        System.out.println("Numero: " + numero);
        System.out.println("Repeticiones consecutivas: " + maxRepeticiones);
        System.out.println("Posicion inicial: " + posicion);
    }
}
