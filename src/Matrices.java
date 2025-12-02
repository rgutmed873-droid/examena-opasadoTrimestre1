import java.util.Random;

public class Matrices {
   public  static void main(String[] args) {

       int [] [] matriz = new int[5][5];

        inicializarMatriz(matriz);
        sumaSubmatriz(matriz);
   }

    private static void sumaSubmatriz(int[][] matriz) {
        int suma = 0;


    }

    private static void inicializarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = generarNumerosAleatorios(0,100);

                System.out.print(" | " +  matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }


    private static int generarNumerosAleatorios(int min, int max){
       Random rand = new Random();
       return rand.nextInt(max-min+1)+min;
   }
}
