public class MaxValue {
    public static void main(String[] args) {

        int[] array = {12,6,66,85,131,10};
        int max = array[0];
        int indexOfMax = 0;

        for (int i = 1; i< array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
                 break;
            }
        }
        System.out.println("The max value is " + max);
        System.out.println("The index of the max value is " + indexOfMax);
    }
}