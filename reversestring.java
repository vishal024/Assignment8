import java.util.Scanner;
class Reverse
{
   public static void main(String[] args)
  {  
     int i;
     String rev="";
     Scanner s=new Scanner(System.in);
     System.out.println("enter a string");
     String str=s.nextline();
     for(i=str.length()-1;i>=0;i--)
     {
        rev=rev+str.charAt(i);
     }
     System.out.println(rev);
   }
}