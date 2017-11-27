public class transprogram {
    public static void main(String[]args){
        int[][] ting = new int[][] {{2,3,4},
                                    {5,4,3},
                                    {7,3,1}};
        transpose nyt = new transpose();
        for (int i = 0; i <nyt.returnme(ting).length ; i++) {

            for (int x = 0; x <nyt.returnme(ting).length ; x++) {
                System.out.print(nyt.returnme(ting)[i][x]);
            }
            System.out.print("\n");

        }


    }
}
