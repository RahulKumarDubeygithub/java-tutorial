//find the factorial of a number
import java.util.*;
class factorial{
    public static void calculatefactorail(int a){
        int fact=1;
        if(a<0){
            System.out.print("invalid number");
        }
        //loop
        for(int i=a;i>=1;i--) {
            fact =fact*i;
        }
        System.out.println(fact);
        return ;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any number:");
        int a= sc.nextInt();
        calculatefactorail(a);



    }
}