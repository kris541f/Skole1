import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many quarters do you have?");
        int quarters = reader.nextInt();
        System.out.println("How many dimes do you have?");
        int dimes = reader.nextInt();
        System.out.println("How many nickels do you have?");
        int nickels = reader.nextInt();
        System.out.println("How many pennies do you have?");
        int pennies = reader.nextInt();
        double dollar = (double)quarters * 0.25D + (double)dimes * 0.1D + (double)nickels * 0.05D + (double)pennies * 0.01D;
        System.out.println("You have "+dollar+" dollars");
    }
}
