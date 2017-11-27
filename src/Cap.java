public class Cap {
    public static void main(String[] args) {
        int[][] h = new int[1][1];
        h[1][1]=2;
        if (h[1][1]==2){
            System.out.println("hej");
        }
        for (int i = 0; i < args.length; i++) {
            String as = args[i];
            for (int x = 0; x < as.length(); x++) {
                char d = as.charAt(x);
                if (Character.isLetter(d)){
                    System.out.print(as.substring(0,x));
                    System.out.print(Character.toUpperCase(d));
                    System.out.print(as.substring(x + 1) + " ");
                    break;
                }
            }
        }
    }
}
