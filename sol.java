import java.util.*;
import java.text.*;
public class sol
{
 static void printLastCharacter(String str)
 {
  str=str+" ";
  int i;
  for(i=0;i<str.length();i++)
  {
   if(str.charAt(i)==' ')
  System.out.print(str.charAt(i-1));
  }
 }
public static void main(String args[]) throws Exception
{
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();
 printLastCharacter(str);
}
}