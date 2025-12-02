import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

    int [] array = new int [10];
    inicializarArray(array);


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
