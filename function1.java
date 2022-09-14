//print a given name in a function
import java.util.*;
class function1{
    //function or method
    public static void printMyName(String name){
        //printing statement
        System.out.println(name);
        return;
    }
    public static void main(String[]args){
        //taking input in java
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name:");
        String name = sc.next();
        //calling function
        printMyName(name);
        
    }


}