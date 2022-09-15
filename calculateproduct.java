//make a function to multiply 2 numbers and return the product
import java.util.*;
class calculateproduct{
    public static int printProduct(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a:");
        int a = sc.nextInt();
        System.out.println("please enter b:");
        int b = sc.nextInt();
        int product = printProduct(a,b);
        System.out.println("product of two number is:"+product);
    }
}