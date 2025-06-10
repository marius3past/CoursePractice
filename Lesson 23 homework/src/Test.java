import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter an error code!");
        int code = scanner.nextInt();

       ErrorCode errorCode = ErrorCode.fromCode(code);

       if (errorCode!= null) {
           System.out.println("Message : " + errorCode.getUserMessage());
       }
       else {
           System.out.println("This is an unknown error.");
       }

       if (errorCode.isFatal()) {
           System.out.println("This is a FATAL error. It is mandatory to call for support.");
       }
       else {
           System.out.println("This is not urgent. The problem will be fixed shortly.");
       }
    }
}
