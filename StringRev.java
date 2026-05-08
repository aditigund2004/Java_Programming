public class StringRev{

    public static void main(String[] args) {
String str = "hello";

String result = "";

for (int i = str.length() - 1; i >=0; i--){

result += str.charAt(i);
}
System.out.println("Reverse string :"  + result);
        
    }
}