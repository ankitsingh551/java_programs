import java.util.Scanner;
class GreaterTwo
{
    public static void main(String[] args)
    {
        System.out.println("enter two no.");
        Scanner s=new Scanner(System.in);
        int no1=s.nextInt();
        int no2=s.nextInt();
        if(no1>no2){
            System.out.println(no1+ "is greater");
        }
        else
        {
            System.out.println(no2+"is greater");
        }


    }
}