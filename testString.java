class testString {

public static void main(String [] ar)
{

String s1="hello";
String s2="hello";
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

StringBuffer s3=new StringBuffer("hello");
StringBuffer s4=new StringBuffer("hello");
System.out.println(s3);
System.out.println(s4);
System.out.println(s3.hashCode());
System.out.println(s4.hashCode());


}
}
