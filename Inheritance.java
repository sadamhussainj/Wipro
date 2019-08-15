class Bike{
void run(String name){
System.out.println("from class Bike"+" "+name);
}
}

class Splendor extends Bike{
void run(){
System.out.println("from Splendor class");
}
}
class Inheritance{
public static void main(String[]args){
Bike b=new Splendor();
b.run("sadam");
}
}
