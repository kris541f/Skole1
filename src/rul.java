public class rul {
    public static void main(String[]args){
        rollingdice dice = new rollingdice();
        do {
            dice.roll();
            if (dice.getTotal()==2){
                System.out.println("The results were "+dice.getDie1()+" and "+dice.getDie2()+". You win!");
            }else{
                System.out.println("The results were "+dice.getDie1()+" and "+dice.getDie2());

            }
        }while (dice.getTotal()!=2);
    }
}
