public class Exercise3 {
    public static void main(String[] args) {
        int[] array1 = {13, 42, 36, 14, 25};  // Source array
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        for (int value : array2) {
            System.out.print(value + " ");
        }
    }
}
