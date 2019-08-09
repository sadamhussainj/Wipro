import java.util.Scanner;
class primecount {
public static void main(String[] qwe) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
 int i = 3, count, c;
if(n >= 1)
    {
        System.out.println("First "+n+"prime numbers are :  ");
        System.out.println("2 ");
    }
 for(count = 2; count <= n; i++)  
    {
        // iteration to check c is prime or not
        for(c = 2; c < i; c++)
        {
            if(i%c == 0)
                break;
        }

        if(c == i)  // c is prime
        {
            System.out.println(i);
            count++;    // increment the count of prime numbers
        }

    }
}
}
