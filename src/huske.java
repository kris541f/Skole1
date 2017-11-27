

public class huske {
    public static int tuller=1;
    static int[][][] lala = new int[9][9][9];

    public static void add(int x,int y,int i){
        lala[x][y][i]=tuller;
        tuller++;
    }
    public static int findex(int i) {
        Integer q=new Integer(0);
        for (int x = 0; x < lala.length; x++) {
            for (int y = 0; y < lala.length; y++) {
                for (int k = 0; k < 9; k++) {
                    if (lala[x][y][k] == i) {

                        q = x;

                    }


                }
            }
        }return q;
    }
    public static int findey(int i){
        Integer o = new Integer(0);
        for (int x = 0; x <lala.length ; x++) {
            for (int y = 0; y <lala.length ; y++) {
                for (int k = 0; k <9 ; k++) {
                    if (lala[x][y][k]==i){
                    o=y;
                }}
            }
        }return o;
    }
    public static int findei(int i){
        Integer t = new Integer(0);
            for (int x = 0; x <lala.length ; x++) {
                for (int y = 0; y < lala.length; y++) {
                    for (int k = 0; k < 9; k++) {
                        if (lala[x][y][k]==i){
                            t=k;
                        }
                    }
                }

            }return t;}

    private static int x;
    private static int y;
    private static int i;
    public huske(int x, int y,int i){
        this.x=x;
        this.y=y;
        this.i=i;
    }
    public huske(){

    }
    public boolean hmm(int x, int y, int i){
        return lala[x][y][i]==0;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int getI(){
        return i;
    }

}
