import java.util.Random;


public class Main {

    private static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[][] array = new int[6][7];
        
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(10);
            }
        }

        printArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > array[i][0]) {
                    int tmp = array[i][0];
                    array[i][0] = array[i][j];
                    array[i][j] = tmp;
                }
            }
        }

        printArray(array);

    }
}