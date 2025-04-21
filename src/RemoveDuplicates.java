public class RemoveDuplicates {
    public int removeDuplicate(int[] array) {
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[index - 1]) {
                array[index] = array[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicates duplicates = new RemoveDuplicates();
        int[] array = {1, 2, 3,3, 4, 5, 5};
        int newLength = duplicates.removeDuplicate(array);
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
