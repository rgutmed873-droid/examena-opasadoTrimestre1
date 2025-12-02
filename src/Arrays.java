import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

    int [] array = new int [10];
    inicializarArray(array);
    sumaArray(array);

    }

    /**
     * Metodo para realizar la suma de una array en el que los dos elementos más grandes den la suma máxima
     * Junto con la suma de todos los otros valores
     * @param array
     */
    private static void sumaArray(int[] array) {
        int suma = 0;
        int sumaMax = 0;
        int valor1 = 0;
        int valor2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                suma = array[i] + array[j];
                if (suma > sumaMax) {
                    sumaMax = suma;
                    valor1 = array[i];
                    valor2 = array[j];

                }
                System.out.println("suma: " + suma);
            }
        }
        System.out.println("Los dos elementos del array son " + valor1 + " " + valor2 + " la suma máxima es: " + sumaMax);
    }

    private static void inicializarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] = numerosAleatorios(0,20));
        }
    }

    private static int numerosAleatorios(int min, int max) {

        Random aleatorio = new Random();
        return aleatorio.nextInt(max - min + 1) + min;
    }
}
