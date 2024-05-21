 import java.util.Scanner;
 class LargerThree
 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first no.");
        int no1=s.nextInt();
        System.out.println("enter second no.");
        int no2=s.nextInt();
        System.out.println("enter third no.");
        int no3=s.nextInt();
        if(no1>no2)
        {
          if(no1>no3)
          {
            System.out.println(no1+"is greatre");
          }
          else
          {
            System.out.println(no3+ "is greater");
          }
        }
          else if(no2>no3)
          {
            System.out.println(no2+"is greatre");

          }  
          else{
            System.out.println(no3+"is greater");
          }


        }

    }
