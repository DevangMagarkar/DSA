public class power {
    public static int calcPower(int x, int n)
    {
        //base case
        if(n==0)
        {
            return 1;
        }
        // //function call
        // int xnm1 = calcPower(x, n-1);

        // //condition
        // int xn = x * xnm1;
        // return xn;
        return x* calcPower(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcPower(2, 10));
    }
    
}
