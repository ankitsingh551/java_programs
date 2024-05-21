import java.util.Scanner;
class LeapYear2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out .println("enter year for start");                               
        int y=s.nextInt();
        System.out.println("enter year to end ");
        int n=s.nextInt();
        for(int i=y;i<=n;i++)
        {
            if((i%400==0)||(i%4==0 && i%100 !=0))
        {
            System.out.println(i);
        }
    }
}
}