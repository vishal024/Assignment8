import java.util.Scanner;
class Substring
{
     public static void substring(String str,int n)
    {
        for(int i=0;i<n;i++)
          {
              for(int j=i+1;j<=n;j++)
                {
                    System.out.println(str.substring(i,j));
                 }
            }
       }
 
       public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        System.out.println(" enter a string");
        String str=s.next();
        substring(str,str.length());
      }
}