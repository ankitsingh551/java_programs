import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.");
        int no=s.nextInt();
        System.out.println("enter the limit");
        int n=s.nextInt();
        int temp,rev=0,rem;
        System.out.println("palindrome no is");
        for(int i =no; i<=n ;i++){
            temp=i;
            while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }    
        if(rev==i){
        System.out.println(+i);
    }
    rev =0;

}
}
}