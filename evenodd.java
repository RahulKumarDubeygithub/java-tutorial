import java.util.*;
class evenodd
{
    public static void main(String args[])
    {
        //System.in is a standard input stream
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your number:");
        int num = sc.nextInt();
        if(num % 2 != 0)
        {
            System.out.println("odd");
        }
        else
        {
           System.out.println("even");
        }

    }
}