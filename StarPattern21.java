class StarPattern21
{
    public static void main(String[] args)
    {
        int i,j,k;
        for(i=1;i<=4;i++){
            k=1;
            for(j=1;j<=7;j++){
                if(j>=5-i){
                    System.out.print("*");
                   k= (k<5)? k++ : k-- ;
                }
                else
                System.out .print("");
            }
            System.out.println();
        }
                

                }
            }