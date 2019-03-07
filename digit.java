import java.util.*;
class digit
{
public  static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int c=0;
while(a!=0)
{
a=a/10;
c++;
}
System.out.println(c);
}}
