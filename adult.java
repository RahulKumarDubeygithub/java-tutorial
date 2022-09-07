import java.util.*;
class adult
{
    public static void main(String args[])
    {
        //System.in is a standard input stream
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println(" Not Adult");
        }

    }
}
