//Make a function to add 2 numbers and return the sum
import java.util.*;
class function2{
    //function or method
    public static int printAdd(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a :");
        int a = sc.nextInt();
        System.out.println("please enter b :");
        int b = sc.nextInt();
        //method calling
        int sum = printAdd(a,b);
         System.out.println("sum of two numbers:"+sum);

    }
}