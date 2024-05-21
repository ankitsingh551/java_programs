public class Recurssion2 {
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
     sum+=i;
     printsum(i+1,n,sum);
    }
    public static void main(String[] args) {
        int i=1;
        int n=10;
        int sum=0;
        printsum(i,n,sum);
    }
    
}
