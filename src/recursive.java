public class recursive {
    public long factorial(long n){
        if (n<=1){
            return (long) 1;
        }
        else{
            return n*factorial(n-1);
        }

    }
    public long fibo(long n){
        if (n==0 || n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[]args){
        long tal = Long.parseLong(args[0]);
        recursive hej = new recursive();
        System.out.println("The factorial of "+tal+" is: "+hej.factorial(tal));

        System.out.println("The fibo of "+tal+" is: "+hej.fibo(tal));


    }

}
