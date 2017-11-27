public class Dice {
    public static void main(String[]args){
        int dicea = (int)(Math.random()*6) + 1;
        int diceb = (int)(Math.random()*6) + 1;
        System.out.println("The 2 dice rolls were "+dicea+" and "+diceb);
    }
}
