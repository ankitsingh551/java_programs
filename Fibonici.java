public class Fibonici {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=20;i++){
            c=a+b;
            System.out.println( +c);
            a=b;
            b=c;
        }
    }
    
}
