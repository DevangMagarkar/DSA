public class tilingProblem {
    // we have to return total number of cases
    // in every function call we have choice of choosing vertical or horizontal
    //if we choose vertical n-1 places left
    //if we choose horizontal n-2 places left
    
    public static int tilingProblem(int n){ // 2 * n
        //base case
        if(n==0 || n==1)  // since we are calling fnction for n-2 also we have to check for n==0 and for n==1
        {
            return 1;
        }

        //kaam
        //vertical
        int fnm1 = tilingProblem(n-1);

        //horizontal
        int fnm2 = tilingProblem(n-2);

        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
       System.out.println(tilingProblem(4));
    }
    
}
