import java.util.Scanner;
public statis void main(String[] args){
int i,n=112235,sum,r;
int []a=new int[10];
while(n>0){
r=n%10;
n=n/10;
a[r]=a[r]+1;
}
for(i=0;i<10;i++)
System.out.println(i+" "+a[i]);
}
}
