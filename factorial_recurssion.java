public class factorial_recurssion {
    public static void main(String[] args) {
        System.out.println(printfact(5));
    }
    public static int printfact(int n){
        if(n==1){
            return n;
        }
        int ans=n*printfact(n-1);
        return ans;
    }
}
