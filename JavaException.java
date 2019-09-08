public class JavaException{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      int data1=100;
      int data2=100;
      int sum=data1+data2;
   }catch(ArithmeticException e){System.out.println(e);}  
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}  
