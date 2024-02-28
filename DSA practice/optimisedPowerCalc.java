

public class optimisedPowerCalc {
    public static int calcPower(int a, int x)
    {
        //base case
        if(x==0)
        {
            return 1;
        }

        int halfPower = calcPower(a, x/2)*calcPower(a, x/2);
        //odd case
        if(x%2 != 0)
        {
            halfPower = a* halfPower;
        }
        return halfPower;
    }


        public static int calcOptimisedPower(int a, int x)
        {
            //base case
            if(x==0)
            {
                return 1;
            }
             int calcHalfPower= calcPower(a, x/2);
            int halfPower = calcHalfPower*calcHalfPower;
            //odd case
            if(x%2 != 0)
            {
                halfPower = a* halfPower;
            }
            return halfPower;
        }
   public static void main(String[] args) {
    int a = 2;
    int x=10;
   System.out.println(calcPower(a, x));
   System.out.println(calcOptimisedPower(a, x)); // but this method is of O(n2) time complexity since it is calculating half power n times
   }
    
}
