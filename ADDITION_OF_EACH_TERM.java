import java.util.Scanner;

public class ADDITION_OF_EACH_TERM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        String number = input.nextLine();
        int addition = 0;
        for (int i = 0; i < number.length(); i++) {
            addition += Character.getNumericValue(number.charAt(i));
        }
        System.out.println(addition);

    }
}
