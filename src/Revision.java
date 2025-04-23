class Revision {
    public int removeDuplicated(int[] arr) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j - 1] != arr[i]) {
                arr[j] = arr[i];
                j++;
            }

        }
        return j;
    }

    public static void main(String[] args) {
        Revision revision = new Revision();
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int newLength = revision.removeDuplicated(arr);
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}