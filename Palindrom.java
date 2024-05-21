import java. util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int rem=0;
        int temp=num;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println(num+" is palindrome number");
        }
        else{
            System.out.println(num+" is not palindrome number");
        }


        
    }
    
}
