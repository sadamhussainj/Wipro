import java.util.Scanner;
class SumArray{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i,n,sum;
n=s.nextInt();
int[] a=new int[n];
for(i=0;i<n;i=i+1){
a[i]=s.nextInt();
}
System.out.println("The number are:");
for(i=0,sum=0;i<n; i=i+1){
System.out.println(a[i]);
sum=sum+a[i];
}
System.out.println("the sum is:"+sum);
}
}
