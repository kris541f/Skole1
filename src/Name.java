import java.util.Scanner;
public class Name {
    public static void main(String[]args){
        Scanner reader= new Scanner(System.in);
        System.out.println("Please input your first and last name seperated by a space.");
        String name = reader.nextLine();
        int tal = name.indexOf(" ");
        String first = name.substring(0,tal);
        String last = name.substring(tal+1);
        int lenf = first.length();
        int lenl = last.length();
        String capfirst = first.substring(0,1).toUpperCase()+first.substring(1);
        String caplast = last.substring(0,1).toUpperCase()+last.substring(1);
        System.out.println("Your first name is "+capfirst+" and your name has "+lenf+" characters.");
        System.out.println("Your last name is "+caplast+" and you last name has "+lenl+" characters.");
        }
    }
