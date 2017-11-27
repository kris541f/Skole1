import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class datafile {
    public static void main(String[]args){
        Scanner data;
        try {
            //Wrap File object i scanner object
            data = new Scanner(new File(args[0]));
            ArrayList<String> liste = new ArrayList<String>();
            while (data.hasNext()) {
                liste.add(data.nextLine());
            }
            Collections.reverse(liste);
            for (String string:liste) {
                System.out.print(string+" ");
            }
            System.out.print("\n");
        }catch (FileNotFoundException e){
            System.out.println("No File Found.");
        }


    }
}
