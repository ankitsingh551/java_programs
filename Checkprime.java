
import java.util.Scanner;
 class Checkprime{ 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
            int temp=0;
            for(int j=2;j<=N-1;j++){
                if(N%j==0){
                temp=temp+1;
                }
            }
            if(temp==0){
            System.out.println(N + " is prime no.");
            }
            else{
                System.out.println(N+" is not prime no.");
            }
        }
    }
        
