public class Recurssion4 {
    public static void printfib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        printfib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        System.out.print(a+" "+ b+" ");
        printfib(a,b,n);
    }
}
