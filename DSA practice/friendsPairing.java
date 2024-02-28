import java.net.SocketTimeoutException;

public class friendsPairing {
    public static int friendsPairing(int n){
        //base case 
        if(n==2||n==1)
        {
            return n;
        }
        //choices
        //single
        int fnm1 = friendsPairing(n-1);
        //pair
        int fnm2 =friendsPairing(n-2);
        int pairingWays = fnm2 * (n-1);

        return fnm1 + pairingWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }    
}
