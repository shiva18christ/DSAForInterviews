public class DiagonalsOfMatrix {
    public int sumOfDiagonalsElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }

    public void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DiagonalsOfMatrix diagonals = new DiagonalsOfMatrix();
        int[][] matrix = new int[3][3];
        matrix[0][0] = 2;
        matrix[0][1] = 3;
        matrix[0][2] = 8;
        matrix[1][0] = 9;
        matrix[1][1] = 7;
        matrix[1][2] = 5;
        matrix[2][0] = 3;
        matrix[2][1] = 8;
        matrix[2][2] = 6;
        diagonals.displayMatrix(matrix);
        System.out.println(diagonals.sumOfDiagonalsElements(matrix));
    }
}
