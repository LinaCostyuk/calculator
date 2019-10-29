import java.util.Scanner;

public class Calculator {
    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        String operation = "";
        int result = 0;

        do {
            int enterNumber = readInt();
            if (operation.equals("")) {
                result = enterNumber;
            }
            if (operation.equals("+")) {
                result += enterNumber;
            }
            if (operation.equals("-")) {
                result -= enterNumber;
            }
            if (operation.equals("*")) {
                result *= enterNumber;
            }
            if (operation.equals("/")) {
                result /= enterNumber;
            }
            operation = askAndRead("Please choose operation: ");

        } while (!(operation.equals("=")));
        System.out.println("Total is: " + result);
    }

    public static String askAndRead(String phrase) {
        System.out.print(phrase);
        return sc.next();
    }

    public static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(askAndRead("Type your number: "));
            } catch (NumberFormatException e) {
                System.out.println("not able to parse data, please try again");
            }
        }
    }

}
