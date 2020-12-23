import java.util.Random;

public class Main {

    public static void Swap(int c1, int c2, int[][] matrix){
        int[] aux =  matrix[c1];
        matrix[c1] = matrix[c2];
        matrix[c2] = aux;
    }



    public static void main(String[] args) {


        int[][] rainMatrix = new int[5][5]; //matrix dimensions (side x side)

        boolean isRainning = true;

        while (isRainning) {
            int columnIndex = new Random().nextInt(4) + 1;
            rainMatrix[0][columnIndex] = 1;

            //making the drop falls
            int colum1Index = 0;
            int colum2Index = 1;
            for (int i = 0; i < rainMatrix.length - 1; i++) {
                Swap(colum1Index, colum2Index, rainMatrix);
                colum1Index++;
                colum2Index++;
            }


        }

    }

}
