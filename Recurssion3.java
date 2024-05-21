public class Recurssion3 {
    public static void printfact(int n,int fact){
        if(n==1){
            System.out.print(fact);
            return;
        }
        fact*=n;
        printfact(n-1,fact);

    }
    public static void main(String[] args) {
        int fact=1;
        int n=10;
        printfact(n,fact);
    }
}
