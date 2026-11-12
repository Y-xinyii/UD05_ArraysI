import java.util.Scanner;

public class Ej1Repetidos{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Crear un array de 15 números.
        int[] arra1 = new int[15];
        //Pedir 15 numero por teclado.
        System.out.println("Introducir 15 números enteros: ");        
        for(int i = 0; i < arra1.length; i++){
            arra1[i] =  scanner.nextInt();
        }
        
        //Segundo array sin repetido
        int[] arra2 = new int[15];
        int contador = 0;

        //Comprobar si retipe el número
        for (int i = 0; i < arra1.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < contador; j++) {
                if (arra1[i] == arra2[j]) {
                    repetido = true;
                    break;
                }
            }
            //Guardar número si no está repetido
            if (repetido == false) {
                arra2[contador] = arra1[i];
                contador++;
            }
        }
        //Mostar arry no repetido
        System.out.println("Array sin repetidos:");

        for (int i = 0; i < contador; i++) {
            System.out.print(arra2[i] + " ");
        }
        scanner.close();
    }
}