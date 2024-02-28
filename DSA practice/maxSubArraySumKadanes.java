package array;
public class maxSubArraySumKadanes {
 public static void kadanes(int arr[])
 {  int  ms=Integer.MIN_VALUE, cs=0;
    for(int i=0;i<arr.length;i++)
    {
       if(cs<0)
       {
        cs =0;
       }

       cs= cs+ arr[i];
        ms =Math.max(cs, ms);      
    } 
    System.out.println("maximum sum is "+ ms);
 }
    public static void main(String[] args) {
        int arr[] ={-2,-3,-1,-2,-3};
        kadanes(arr);
    }
}