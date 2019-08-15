class UniqueDigit{
public static void main(String [] args){
int n=4567123;
int rem=0;
int arr[]=new int[10];
while(n>0)
{
rem=n%10;
arr[rem]++;
n=n/10;
}
int count=0;
for(int i=0;i<arr.length;i++){
if(arr[i]>0){
count++;
}
}
System.out.println("THE UNIQUE DIGIT IS"+count);
}
}
