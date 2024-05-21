import java.util.Scanner;
 class Primeno { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=2;i<=N;i++){
            int temp=0;
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                temp=temp+1;
                }
            }
            if(temp==0){
            System.out.println("prime no.s are :"+i);
            }
        }
        
    }
    
}
