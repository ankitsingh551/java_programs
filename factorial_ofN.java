public class factorial_ofN {
    public static int printfact_ofN(int n){
        if(n==0){
            return 1;
        }
        int fact=printfact_ofN(n-1);
        int factnum=n*fact;
        return factnum;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=printfact_ofN(n);
        System.out.println(ans);
    }
    
}
