public class StringProcessing{
static void strProcess(String input1, int input2){
String arr[]=input1.split(" ");
String str1=arr[(input2/10)-1];
String str2=arr[(input2%10)-1];
StringBuilder sb=new StringBuilder(str1.substring(0,str1.length()/2));
String prcsd1=sb.reverse().toString()+str1.substring(str1.length()/2);
System.out.println(prcsd1);
}
public static void main(String[] args) {
String str1="Jeppiaar Engineering College Chennai";
strProcess(str1, 42);
}
