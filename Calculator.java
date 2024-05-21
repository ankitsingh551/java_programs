import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the value of a:-");
        int a=s.nextInt();
        System.out.println("enter the value of b");
        int b=s.nextInt();
        System.out.println("choose the symbol from(+,-,*,/,%)");
        String sym=s.next();
        int res;
        switch(sym)
        {
            case "+": res= a+b;
                     System.out.println("addition is:"+res);
                     break;
            case "-": res= a-b;
                     System.out.println("substraction is:"+res);
                     break;
            case "*": res= a*b;
                     System.out.println("multiplication is:"+res);
                     break;
            case "/": res= a/b;
                     System.out.println("division is :"+res);
                     break;
            case "%": res= a%b;
                     System.out.println("remainder is:"+res);
                     break;
            default: System.out.println("invalid symbol");
            break;         

        }


    }
}
