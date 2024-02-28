public class lastOccurence {
    public static int lastOccurence(int arr[], int key, int index){
        //base case
        if(index == arr.length)
        {
            return -1;
        }
        //in this case first look forward then see at current value if key exists
        // in this case of recursion
        // we have to define a variable which stores the value returned by forward cases, we can't simply return it

        int isFound= lastOccurence(arr, key, index+1);
        if(isFound != -1)
        {
            return isFound;
        }
        //check with self
        if(arr[index]==key)
        {
            return index;
        }
        //or if(isFound ==-1 && ar[index]== key)
        //   {
        //        return i;
        //    } 
        //
        return isFound; //or return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2,4,5};
        int key =4;
        int index =0;
        System.out.println(lastOccurence(arr, key, index));
    }
}
