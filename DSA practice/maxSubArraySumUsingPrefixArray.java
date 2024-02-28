package array;
public class maxSubArraySumUsingPrefixArray {
    public static void maxSubarraySum(int arr[])
    {   int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        //first we will form new array => prefix array
        int prefix[] = new int[arr.length];
        prefix[0]= arr[0];
        for(int i=1;i<prefix.length;i++)
        {
             prefix[i] = prefix[i-1]+ arr[i];
        }

        for(int i=0; i<arr.length;i++)
        {  int start =i;
            currSum=0;
            for(int j=i;j<arr.length;j++)
            {
                int end =j;   

                currSum = (start==0)? prefix[end] :prefix[end]-prefix[start-1];
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
            
        }
           System.out.println("maximum subarray sum is "+ maxSum);
    }

    public static void maxSubArraySumCalc(int arr[])
    {   
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        //creation of prefix Array
        int prefix[] = new int[arr.length];
        prefix[0]= arr[0];
        //to fill value in every index of an array we need to traverse whole array using a loop
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1]+ arr[i]; 
        }
        
        //now to find subarrray sum
        //we need two loops
        //one as the starting index of subarray
        //another as ending index of subarray
        
        for(int i=0;i<arr.length;i++)
        {
            int start =i;
            currSum=0;    
            for(int j=i;j<arr.length;j++)
            {   
                int end =j;
               currSum = (start==0 )? prefix[end]:prefix[end]-prefix[start-1];
               if(currSum>maxSum)
               {
                maxSum = currSum;
               } 
                
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        maxSubarraySum(arr);
    }
}
