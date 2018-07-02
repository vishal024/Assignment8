import java.util.Scanner;
class Remove
{
   public static void main(String[] args)
  {
     String str,removal;
     Scanner s=new Scanner(System.in);
     System.out.println("enter a string");
     str=s.nextLine();
     System.out.println("original string before removal is:"+str);
     System.out.print("after removing vowels string is:");
     removal=str.replaceAll("[aeiouAEIOU]","");
     System.out.println(removal);
   }
}
