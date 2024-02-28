
// to print pairs we need two loops 

public class pairsinArray {
    public static void printPairs(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)       //i must go till second last element
        {
            for(int j=i+1;j<arr.length;j++) //j ki value i se ek zada rhegi aur last element tk jaygi
            {
                System.out.print("(" + arr[i] +","+ arr[j] +") ");   
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8};
        printPairs(arr);
    }
}
