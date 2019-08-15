import java.util.Scanner;
class Collge{
public static void main(String[] arg){
String sentence="Welcome to TamilNadu Boys"; 
String s1=sentence.substring(8,10);
System.out.println(s1);
String s2=sentence.substring(21,25);
System.out.println(s2);
String s3=s2.substring(0,2);
System.out.println(s3);
StringBuilder x= new StringBuilder(); 
x.append(s3);
x= x.reverse(); 
System.out.println(x); 
String s4=s2.substring(2,4);
System.out.println(s4);
String s5=x+s4;
System.out.println(s5);
String Answer=s1+" "+s5;
System.out.println("Answer");


}
}
