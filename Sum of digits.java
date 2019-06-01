class Sum
{
public static void main(String g[])
{
int num=865,sum=0;
while(num>0)
{
sum=sum+(num%10);
num=num/10;
}
System.out.print(sum);
}}