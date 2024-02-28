



public class printDec {
    public static void printDec(int n) {
        // base case
        if (n == 1) {
             System.out.print(n +" ");
            return; //learnt a new thing 
                      //if we want to return with function as void type return
        }
        
        System.out.print(n + " ");
        printDec(n-1);
       
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
