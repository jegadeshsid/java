class L
{
public static void main(String j[])
{
int now =9;
int count=0;
String mydir="down";
int lift[]={4,7,1,3,4,8};
String direction[]={"up","up","up","down","down","down"};




 if(mydir=="up")//i want to go upwards
{
int want=1;
for(int i=0;i<=5;i++)
{
if((direction[i]=="up")&&(lift[i]<=now))//lift below me going up
{
if(want<=lift[i])//get nearer lift
{
want=lift[i];
count++;
}}}
if(count==0)
System.out.println("no lift");
else
System.out.println(want);
}




 if(mydir=="down")//i want to go downwards
{int want=10;
for(int i=0;i<=5;i++)
{

if((direction[i]=="down")&&(lift[i]>=now))//lift above me going down
{
if(want>=lift[i])//to get nearer lift
{want=lift[i];
count++;
}
}}
if(count==0)
System.out.println("no lift");
else
System.out.println(want);
}

 

}}

