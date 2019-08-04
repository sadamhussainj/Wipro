import java.util.Scanner;
class Fib{
public static void main(String[]args){
int n =12;
int y=0;
int z=1;
for(int c=0;c<=n;c++){
System.out.println(c);

for( c=1 ;c<=n;c++){

int  x= y+z;
y=z;
z=x;
System.out.println(x);
}
}
}
}
