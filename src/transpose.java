public class transpose {

    public int[][] returnme(int [][] liste){
        int [][] nyliste = new int[liste.length][liste.length];
        for (int i = 0; i <liste.length ; i++) {

            for (int x = 0; x < liste.length; x++) {
                nyliste[i][x]=liste[x][i];
            }
        }
        return(nyliste);
    }
}
