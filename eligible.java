import java.util.*;
class eligible
{
    public static void main(String[] args)
    {
        //System.in is a standard input stream
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age:");
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("you are eligible for vote");
        }
        else
        {
           System.out.println("your  are not eligible for vote"); 
        }
        System.out.println("Thank you");
        


    }
}