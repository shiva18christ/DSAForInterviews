import java.util.Scanner;

public class MatrixTwo {
    public void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixTwo mat = new MatrixTwo();
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter the element at position " + i + " " + j);
                matrix[i][j] = input.nextInt();
            }
        }
        mat.displayMatrix(matrix);
        input.close();
    }
}
