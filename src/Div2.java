public class Div2 {
    public static void main(String[]args){
        int args1 =Integer.parseInt(args[0]);
        int resultatnummer=0;
        int temp = 0;
        int nummeret=0;
        for (int testnummeret=1;testnummeret<=args1;testnummeret++) {
            for (int divisor = 1; divisor <= testnummeret; divisor++) {
                if (testnummeret % divisor == 0) {
                    temp++;
                }
            }
            if (temp>resultatnummer){
                resultatnummer=temp;
                nummeret=testnummeret;
            }temp=0;

        }System.out.println("Number: "+nummeret);System.out.println("Divisors: " +resultatnummer);
    }
    }


