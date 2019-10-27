import java.util.Scanner;

public class Calculator {
    private static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        String operation = "";
        int result = 0;

        do {
            int enterNumber = readInt();
            if(operation.equals("")) {
                result = enterNumber;
            }
            if(operation.equals("+")) {
                result += enterNumber;
            }
            if(operation.equals("-")){
                result -= enterNumber;
            }
            if (operation.equals("*")){
                result *= enterNumber;
            }
            if (operation.equals("/")){
                 result /= enterNumber;
            }
           operation = askAndRead("Please choose operation: ");
              
        } while (!(operation.equals("=")));
        System.out.println("Total is: " + result);
    }

    public static String askAndRead(String phrase){
        System.out.print(phrase);
        return sc.next();
    }

    public static int readInt() {
        return Integer.parseInt(askAndRead( "Type your number: "));

    }
}
