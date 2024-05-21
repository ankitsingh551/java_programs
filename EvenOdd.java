import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter any number");
        int no=s.nextInt();
        if(no%2==0)
        {
            System.out.println(no+"is even");
        }
        else{
            System.out.println(no+"is odd");
        }
    }
}