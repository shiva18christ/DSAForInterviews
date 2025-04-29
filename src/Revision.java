class Revision {
    public void DisplayMatrix(int[][] mat) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Revision revision = new Revision();
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        revision.DisplayMatrix(matrix);

    }
}