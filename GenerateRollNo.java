import java.util.Scanner;
class GenerateRollNo{
public static void main(String[] arg){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the Name");
String Name=scan.nextLine();
System.out.print("Enter the DOB");
String DOB=scan.next();
System.out.print("Enter the Dept");
String Dept=scan.next();
System.out.print("Enter the College");
String College=scan.nextLine();
String Regno=College.substring(0,1)+Dept.substring(0,2)+DOB.substring(0,2)+Name.substring(0,4)+DOB.substring(2,4)+DOB.substring(3,5);
System.out.print(Regno);
}
}
