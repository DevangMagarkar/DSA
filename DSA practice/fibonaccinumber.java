public class fibonaccinumber {
    public static int fibonaccinumber(int n){
        if(n==0 || n==1 )
        {
           return n;
        }
        int fibn = fibonaccinumber(n-1) + fibonaccinumber(n-2);
        return fibn;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibonaccinumber(n));
    }
    
}
