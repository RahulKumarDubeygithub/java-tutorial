//print the sum of first  n natural numbers
import java.util.*;
class sumprint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("please enter your number:");
            int num = sc.nextInt();
            int sum = 0;
            for(int i=1;i<=num;i++){
                sum = sum + i;
            }
            System.out.println("sum:"+sum);
            
        }

    }
