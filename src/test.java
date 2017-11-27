//problem: Jeg har ingen backtracing. Jeg skal kunne gå tilbage og ændre til der er sat forkert.

import java.util.ArrayList;

public class test {


    public boolean erderenløsning(int[][] map){
        int tæller2=0;
        int tæller=0;
        int[][] kopi=map.clone();
        for (int x =0;x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                for (int i = 0; i < 9; i++) {
                    while (Math.signum(kopi[x][y])==-1.0) {
                        huske wtf = new huske();
                        int hulul=-kopi[x][y];
                        System.out.println(hulul);
                        hulul= (hulul+1)%10;
                        System.out.println("HVAD er TULLER: "+wtf.tuller);
                        if (hulul==0&&wtf.tuller==1){
                            return false;
                        }
                        System.out.println(hulul);
                        huske hehe1= new huske();
                        if (check(hulul,x,y,kopi)&&hehe1.hmm(x,y,i)){

                            kopi[x][y] = hulul;
                            hehe1.add(x,y,hulul);

                            tæller=0;
                            System.out.println("sat");
                        huske hehe = new huske(x,y,hulul);
                        erderenløsning(kopi);}else {kopi[x][y]=-hulul;
                        System.out.println(-hulul);}
                    }

                    if (kopi[x][y]==0){
                        huske hehe2 = new huske();
                        if (check(i,x,y,kopi)&&hehe2.hmm(x,y,i)){
                            hehe2.add(x,y,i);

                            kopi[x][y]=i;
                            tæller=0;
                            huske hehe=new huske(x,y,i);
                            System.out.println(x+" "+y+ " "+i+" pseudo-sat");}else {

                            tæller++;
                            System.out.println("tæller "+tæller+" : "+x+" "+y);
                            if (tæller==9){
                                huske hihi = new huske();


                                hihi.tuller--;

                                kopi[hihi.findex(hihi.tuller)][hihi.findey(hihi.tuller)]=-hihi.findei(hihi.tuller);
                                System.out.println("X: "+hihi.findex(hihi.tuller)+" Y: "+hihi.findey(hihi.tuller)+" tal på plads: "+hihi.findei(hihi.tuller));

                                erderenløsning(kopi);

                    }
                        }
                    }
                }

            }
        }
        return true;
    }




    public boolean check(int i,int x, int y,int[][] hej) {
        //check lodret
        for (int g = 0; g < 9; g++) {
            if (hej[g][y]==i){

                return false;
            }
        }
        //check vandret
        for (int h = 0; h <9 ; h++) {
            if (hej[x][h]==i){

                return false;
            }
        }
        //check kasse. Brug floor division.gang med kvotienten og læg til 1.
        int a = x/3;
        x=a*3;
        int b = y/3;
        y=b*3;
        b=y+3;
        a=x+3;
        for (int j = x; j<a ; j++) {
            for (int k=y; k<b ; k++) {
                if (hej[j][k]==i){
                    return false;
                }
            }
        }
        return true;
    }
}
