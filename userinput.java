import java.util.*;
class userinput
{
    public static void main(String[] args)
    {
        //System.in is a standard input stream
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("please enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("Sum:"+(a+b));
        System.out.println("Difference:"+(a-b)); 
        System.out.println("Multiplication:"+(a*b));

    }
}