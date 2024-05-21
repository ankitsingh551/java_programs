public class Sum_ofN {

    public static int printsum_ofN(int n){
        if(n==1){
            return 1;
        }
        int sumofN=printsum_ofN(n-1);
        int calsum=n+sumofN;
        return calsum;
    }
    public static void main(String[] args) {
        int n=10;
        int ans=printsum_ofN(n);
        System.out.println(ans);
    }
}