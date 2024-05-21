public class Fibonacii {
    //Function to return list containing first n fibonacci numbers.
    public static int printFibb(int n) 
    {
        int a=1;
        int b=1;
        int c=0;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++){
            c=a+b;
            System.out.print( +c + " ");
            a=b;
            b=c;
        }
        return c ;
    }
    public static void main(String args[]){
        int N=5;
       printFibb(N);
    }
}
