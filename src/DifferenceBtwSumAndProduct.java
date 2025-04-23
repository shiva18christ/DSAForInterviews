public class DifferenceBtwSumAndProduct {
    public int calculateDifference(int[] arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            product = product * arr[i];
        }
        return product - sum;
    }

    public static void main(String[] args) {
        DifferenceBtwSumAndProduct diff = new DifferenceBtwSumAndProduct();
        int[] arr = {1, 4, 6, 7, 8, 12};
        System.out.println(diff.calculateDifference(arr));
    }
}
