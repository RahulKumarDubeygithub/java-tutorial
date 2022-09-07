import java.util.*;
class ifelse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your first number:");
        int num1 = sc.nextInt();
        System.out.println("please enter your second number:");
        int num2 = sc.nextInt();
        if(num1==num2) {
            System.out.println("equl");
        }
        else if(num1>num2){
            System.out.println("first number is greater.");
        }
        else{
            System.out.println("second number is greater.");
        }
    }
}