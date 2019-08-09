import java.util.Scanner;
class prime {
public static void main(String[] qwe) {
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int flag=0;
if(N==0||N==1){
flag=1; }
else{
for(int i=2;i<N;i++) {
if(N%i==0){
flag=1;
break;}
else
continue;
}}
if(flag==1)
System.out.println("nope");
else
System.out.println("prime");
}
}
