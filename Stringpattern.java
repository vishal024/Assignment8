class Pattern
{
  public static void main(String[] args)
  {
     char k;
     for(int i=1;i<=3;i++)
      {
            k='a';
         for(int j=1;j<=3;j++)
          {
             if(j>=4-i&&j<=2+i)
            {
               System.out.print(k+" ");
               k++;                 
             }
             else
              {
                System.out.print(" ");
               }
            }
        System.out.println();
       }
}
}

             