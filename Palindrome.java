class Palindrome
{
public static void main(String arg[])
{
int a=568,b=1,c=0;
int temp=a;
for(;a>0;)
{
b=c+(a%10);
c=b*10;
a=a/10;
}
System.out.println(b);
if (temp==b)
{
System.out.println("palindrome");
}else
{
System.out.println("not a palindrome");
}
}}