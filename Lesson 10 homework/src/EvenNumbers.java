public class EvenNumbers {
    public static void main(String[] args) {
        int[] array = {1, 12, 3, 31, 42, 5};
        int evenNumber = 0;
        int oddNumber = 0;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
            if (array[i] % 2 == 0) {
                evenNumber++;
            }
            else {
                oddNumber++;
            }
        }

        System.out.println("The number of even numbers is " + evenNumber);
        System.out.println("The number of odd numbers is " + oddNumber);
        System.out.println("Max value " + max);
    }
}
