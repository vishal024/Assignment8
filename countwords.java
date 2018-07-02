import java.util.Scanner;
class Count
{
    public static void main(String[] args)
    {
      int count=1;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter a sentence:");
      String str=sc.nextLine();
      int m=str.length();
      for(int i=0;i<m-1;i++)
      {
         if(str.charAt(i)==' '&&str.charAt(i+1)!=' ')
          {
             count=count+1;
           }
       }
       System.out.print("number of words in sentence is:"+count);
}
}