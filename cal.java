import javax.swing.*;
import java.util.*;
public class cal {
    
    public static void main (String[] args ){
        Scanner in =new Scanner(System.in);
		 //if (args.length <= 1) {
            //System.out.println("Error: Please provide exactly one operator. Example: java cal +");
            //return;
        //}
        char operator=args[0].charAt(0);
        System.out.print("enter the first num  : ");
        int num1 =in.nextInt();
        System.out.print("enter the sec num  : ");
        int num2=in.nextInt();
        
        int result=0;
        if (operator == '+') {
             result = num1 + num2;
        } else if (operator == '-') {
             result = num1 - num2;
        } else if (operator == 'x') {
             result = num1 * num2;
        } 
		else if (operator == '/') {
             result = num1 / num2;
        }
		else{
			System.out.println("no entry");
		}
		
        System.out.println("your result is : " + result);
      

        in.close();



    }
}
    