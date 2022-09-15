//make a function to multiply 2 numbers and return the product
import java.util.*;
class calculateproduct2{
    public static int printProduct(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a:");
        int a = sc.nextInt();
        System.out.println("please enter b:");
        int b = sc.nextInt();
        System.out.println("product of two number is:"+ printProduct(a,b));
    }
}