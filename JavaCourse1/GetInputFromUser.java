import java.util.Scanner;
public class GetInputFromUser{

     public static void main(String []args){
         int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer");
        a = in.nextInt();
        if (a%2 == 0){
            System.out.println("You entered even integer "+a);
        }
        else
        {
            System.out.println("You entered odd integer "+a);
        }
   
     }
}