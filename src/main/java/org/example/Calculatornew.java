package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Calculator{
    double num1;
    double num2;

    Calculator(double first,double second){
        this.num1=first;
        this.num2=second;
    }

}
class Add extends Calculator{
    Add(double first,double second){
        super(first,second);
    }
    double calc(){

        return num1+num2;
    }
}
class Sub extends Calculator{
    Sub(double first,double second){
        super(first,second);
    }
    double calc(){

        return num1-num2;
    }
}
class Mul extends Calculator{
    Mul(double first,double second){
        super(first,second);
    }
    double calc(){

        return num1*num2;
    }
}
class Div extends Calculator{
    Div(double first,double second){
        super(first,second);
    }
    double calc(){

        return num1/num2;
    }
}
public class Calculatornew {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger("com.api.jar");
        l.info("Enter the First Number:");
        double first=sc.nextDouble();
        l.info("Enter the Second Number:");
        double second=sc.nextDouble();
//        Calculator c=new Calculator(first,second);

        Add c1=new Add(first,second);
        Sub c2=new Sub(first,second);
        Mul c3=new Mul(first,second);
        Div c4=new Div(first,second);
        l.info("Enter the operator to which operations is going to perform");
        l.info("Addition-->+");
        l.info("Subtraction-->-");
        l.info("Multiplication-->*");
        l.info("Division-->/");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' -> l.log(Level.INFO, () -> "Addition of two numbers: " + c1.calc());
            case '-' -> l.log(Level.INFO, () -> "Subtraction of two numbers: " + c2.calc());
            case '*' -> l.log(Level.INFO, () -> "Multiplication of two numbers: " + c3.calc());
            case '/' -> l.info("Division of two numbers: " + c4.calc());
            default -> {
                l.info("You enter wrong input");
                l.info("Please enter valid input");
            }
        }
    }
}