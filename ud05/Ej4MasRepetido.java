
import java.util.Random;

public class Ej4MasRepetido {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numeros = new int[30];

        // Generar 30 numeros aleatorios entre 1 y 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }

        // Mostrar el array
        System.out.println("Array original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        int numeroMasRepetido = 1;
        int maxRepeticiones = 0;

        // Buscar el numero mas repetido
        for (int i = 1; i <= 10; i++) {
            int contador = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == i) {
                    contador++;
                }
            }

            if (contador > maxRepeticiones) {
                maxRepeticiones = contador;
                numeroMasRepetido = i;
            }
        }

        // Mostrar resultados
        System.out.println();
        System.out.println("Numero mas repetido: " + numeroMasRepetido);
        System.out.println("Numero de apariciones: " + maxRepeticiones);

        System.out.print("Posiciones: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroMasRepetido) {
                System.out.print(i + " ");
            }
        }
    }
}
