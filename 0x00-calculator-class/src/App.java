import java.util.*;
import java.lang.Math;
// code ga7ed yst72 bonus
// coding for grades :)

public class App {

    private double num1;  // el access modifier 7naka ana 3arf eno private by default 
    private double num2;
    private double roootno;

    public void in() {                                           // dy function hta5od el ar2am talma m4 el op m4 sqrt
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = scan.nextDouble();
        System.out.println("Enter the second number:");
        num2 = scan.nextDouble();
        scan.close();
    }

    public void in_root() {                 // dy function el sqrt
        Scanner scanroot = new Scanner(System.in);
        System.out.println("Enter root number:");
        roootno = scanroot.nextDouble();
        scanroot.close();

    }

    public double addition(double x, double y) { // function el addition
        return num1 + num2;
    }

    public double subtraction(double x, double y) {         // function el subtraction
        return num1 - num2;
    }

    public double multiplication(double x, double y) {      // function el multiplication
        return num1 * num2;
    }

    public double divide(double x, double y) {     // function el division
        return num1 / num2;
    }

    public double squ_are_ro_ot(double x) { // function el square root
        return Math.sqrt(roootno);
    }

    public static void main(String[] args) {

        App c = new App();
        String op;
        Scanner scanop = new Scanner(System.in);
        System.out.println("Enter your desired operation:");
        op = scanop.next();

        switch (op) {
            case "+":
                c.in();
                System.out.println("Summation: " + c.addition(0, 0));
                break;
            case "-":
                c.in();
                System.out.println("Subtraction: " + c.subtraction(0, 0));
                break;
            case "*":
                c.in();
                System.out.println("Multiplication: " + c.multiplication(0, 0));
                break;
            case "/":
                c.in();
                System.out.println("Division: " + c.divide(0, 0));
                break;
            case "#":
                c.in_root();
                System.out.println("Root: " + c.squ_are_ro_ot(0));
                break;
            default:
                System.out.println("Operation Error Try Again");
                break;
        }

        scanop.close();

    }

}
