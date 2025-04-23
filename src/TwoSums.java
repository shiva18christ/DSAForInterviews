public class TwoSums {
    public int[] array;

    public TwoSums() {
        array = new int[6];
    }

    public void check(int[] array) {
        int target = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target&& i!=j) {
                    System.out.println(array[i] + " " + array[j]);
                    return;
                }
            }

        }
        System.out.println("No such pair found");
    }

    public static void main(String[] args) {
        TwoSums sum = new TwoSums();
        int[] array = {5, 4, 7, 8, 1, 2};
        sum.check(array);
    }
}
