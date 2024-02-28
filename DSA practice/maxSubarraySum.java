package array;
public class maxSubarraySum {
    public static void maxSubArraySumCalc(int arr[])
    {int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {    currSum=0;
                for(int k=i;k<=j;k++)
                {
                   currSum= currSum+ arr[k]; //current sum is calculated by adding 
                   
                   
                }
                if(currSum> maxSum)
                   {
                    maxSum = currSum;
                   }
                System.out.println("the current sum is " + currSum);
                
                
            }
        }
       System.out.println("maximum subarray sum is "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
      maxSubArraySumCalc(arr);
    }
}
