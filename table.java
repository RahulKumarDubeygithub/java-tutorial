//print the table of a number input by the user
import java.util.*;
class table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("please enter your number:");
            int n = sc.nextInt();
            for(int i=1;i<=10;i++){
                 System.out.println(n*i);
            }
            
        }

    }
