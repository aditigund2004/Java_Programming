class testmyex
{
public static void main(String ar[])
{
String age=ar[0];
int myage=Integer.parseInt(age);
try
{
if(myage<17)
{
throw new myinvalidageexception (age);
}
}
catch(myinvalidageexception e) {
System.out.println(e);

}
}
}
 