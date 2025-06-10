public class Array2 {
    public static void main(String[] args) {
        int[] intArray1 = {1,6,5,13,22,24};
        int sum = 0;
        int average = 0;
        int oddElement = 0;
        int evenElement = 0;
        for (int i = 0; i < intArray1.length; i++) {
          sum += intArray1[i];

              if (intArray1[i] % 2 ==0) {
                  evenElement++;
              }
              else {
                  oddElement++;
              }
          }
        System.out.println(sum);
        average = sum / intArray1.length;
        System.out.println(" The average is " + average);
        System.out.println("The amount of even numbers is " + evenElement);
        System.out.println("The amount of odd numbers is " + oddElement);
    }
}
