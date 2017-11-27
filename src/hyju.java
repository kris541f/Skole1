public class hyju {

    public static void main(String[]args){
        test ny = new test();
        int counter =0;
        int [][] hej = new int[9][9];
        for (int i = 0; i <9 ; i++) {
            for (int x = 0; x <9; x++) {
                hej[i][x]=0;
            }
        }

        hej[0][1]=9;
        hej[0][3]=4;
        hej[0][4]=1;
        hej[0][5]=8;
        hej[0][8]=7;
        hej[1][2]=8;
        hej[1][7]=3;
        hej[2][0]=4;
        hej[2][2]=7;
        hej[2][4]=3;
        hej[2][5]=9;
        hej[2][8]=8;
        hej[3][2]=3;
        hej[3][3]=1;
        hej[3][5]=5;
        hej[3][7]=2;
        hej[3][8]=6;
        hej[4][1]=7;
        hej[4][2]=5;
        hej[4][4]=9;
        hej[4][6]=1;
        hej[4][7]=8;
        hej[4][8]=4;
        hej[5][1]=8;
        hej[5][2]=1;
        hej[5][3]=2;
        hej[5][4]=4;
        hej[5][5]=7;
        hej[5][6]=5;
        hej[5][8]=3;
        hej[6][2]=4;
        hej[6][3]=8;
        hej[6][4]=2;
        hej[6][8]=1;
        hej[7][1]=3;
        hej[7][4]=6;
        hej[7][7]=7;
        hej[7][8]=5;
        hej[8][0]=8;
        hej[8][3]=7;
        hej[8][4]=5;
        hej[8][5]=1;
        hej[8][7]=4;
        hej[8][8]=2;


        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                for (int i = 0; i < 9; i++) {

                    if (hej[x][y]==0&&ny.check(i,x,y,hej)){
                        hej[x][y]=i;
                        if (ny.erderenløsning(hej)){
                            System.out.println("x: "+x+" y: "+y+" giver: "+i);
                            counter++;}else {hej[x][y]=0;}
                    }


                }
            }
        }
        System.out.println(counter);
    }
    }

