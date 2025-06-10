public class Maximum {
    public static void main(String[] args) {
        int[] array = {10, 1, 4, 5, 44, 24};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The max value is " + max);
        System.out.println("The min value is " + min);
    }
}
