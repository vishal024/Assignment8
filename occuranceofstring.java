import java.util.Scanner;
class Occurance
{
    public static int occuranceof(String str,String s)
   {
      int i,j,k,l;
      l=s.length();
      for(i=0;i<str.charAt(i+l-1);i++)
     {
        k=i;
         for(j=0;j<=l-1;j++)
           {
               if(str.charAt(k)!=s.charAt(j))
              {
                 break;
               }
                k++;
            }
           if(j==l)
           {
              return(i);
            }
       }
        return(-1);
}

   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
     System.out.println("enter two String:");
     String str=sc.next();
     String s=sc.next();
     Occurance o=new Occurance();
     int index=o.occuranceof(str,s);
     if(index==-1)
     {
        System.out.println("String not found");
      }
       else
      {
         System.out.print("string found at index:"+index);
    }
}
}
      