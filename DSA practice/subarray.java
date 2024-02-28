


// to print subarray we need three loops to be active
//first loop decides the starting of the subarray
//second loop decides the ending of the subaray
//kyoki i ki ek value ke liye j ki value  i se j tak jaa sakti hai
// third loop will be required to print the subrray elements starting from the starting element till the ending
// third  loop is like a normal array traversing loop 

public class subarray {
    public static void printSubarray(int arr[])
    {   int totalsubarray=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k] + " ");  //yha agr totalarray++ krte to wo har element ko ginta
                    
                }
                totalsubarray++; //jab next line mei ara tab naya subarray
                System.out.println();
            }
           
        }
        System.out.println("total subarrays are " + totalsubarray);
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        printSubarray(arr);
    }
}
