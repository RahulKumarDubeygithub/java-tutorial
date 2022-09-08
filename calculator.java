import java.util.*;
class calculator{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Please enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("Addition:"+(a + b));
        System.out.println("Subtraction:"+(a - b));
        System.out.println("Multiplication:"+(a * b));
        System.out.println("Division:"+(a / b));
        System.out.println("Modulo or remainder:"+(a % b));
    }
}