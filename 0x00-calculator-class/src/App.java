import java.lang.*;
import java.util.*;

public class App {

    double num1;
    double num2;
    double res;


    public void in() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1= scan.nextDouble();
        System.out.println("Enter the second number:");
        num2= scan.nextDouble();

    }
   
    public double addition(int x, int y) 
    {    
        return num1 + num2;
    }

    public double subtraction(int x, int y) 
    {    
        return num1 - num2;
    }
    
    public double multiplication(int x, int y) 
    {    
        return num1 * num2;
    }

    public double divide(int x, int y) 
    {    
        return num1 / num2;
    }

    public static void main (String[] args)
    {

        App c = new App(); 
        String op;
        Scanner scanop = new Scanner(System.in);
        System.out.println("Enter your desired operation:");
        op= scanop.next();

        c.in();
       
        
       
        

        switch (op) {
            case "+":
            System.out.println("Summation: "+  c.addition(0, 0));
                break;
            case "-":
            System.out.println("Subtraction: "+ c.subtraction(0, 0));
                break;
            case "*":
            System.out.println("Multiplication: "+ c.multiplication(0, 0));
                break;
            case "/":
            System.out.println("Division: "+ c.divide(0, 0));
            default:
            System.out.println("Operation Error Try Again");
                break;
        }

    }

        
}
