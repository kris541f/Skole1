import java.util.Scanner;
public class Eggs {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("How many Eggs do you have?");
        int eggs = reader.nextInt();
        int dozen = eggs/12;
        int rest = eggs%12;
        System.out.println("Dozen: "+dozen);
        System.out.println("Rest: "+rest);
    }
}
