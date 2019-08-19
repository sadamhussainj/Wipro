class StringManipulation{
static void strConvert(String input,int ip2){
String [] arr1=input.split(" ");
String st1=arr1[(ip2/10)-1];
String st2=arr1[(ip2%10)-1];

StringBuilder  sb1=new StringBuilder(st1.substring(0,st1.length()/2));
String tmp1=sb1.reverse()+st1.substring(st1.length()/2);

StringBuilder  sb2=new StringBuilder(st2.substring(st2.length()/2));
String tmp2=st2.substring(0,st2.length()/2)+sb2.reverse();
arr1[(ip2/10)-1]=tmp1;
arr1[(ip2%10)-1]=tmp2;
String fin_res=" ";
for(int i=0;i<arr1.length;i++){
fin_res=fin_res+arr1[i]+" ";
}
String fout=" ";
for(int j=0;j<fin_res.trim().length();j++){
if(Character.isLowerCase(fin_res.charAt(j)))
fout=fout+Character.toUpperCase(fin_res.charAt(j));
else
fout=fout+Character.toLowerCase(fin_res.charAt(j));
}
System.out.println(fout);
}
public static void main(String[] fdf){
String str="Jeppiaar Engineering College Chennai";
int no=13;
strConvert(str,no);
}
}
