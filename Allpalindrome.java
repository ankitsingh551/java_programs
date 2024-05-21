import java.util.Scanner;
public class Allpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int rem=0;
        for(int i=1;i<=num;i++){
             int temp=i;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(i==rev){
            System.out.println(i);  
    } 
    rev=0;
}
}
}

    

