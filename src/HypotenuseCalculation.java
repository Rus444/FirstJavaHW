import java.lang.Math.*;

import static java.lang.Math.sqrt;

public class HypotenuseCalculation {

    static void hypotenuse(double a, double b){

        System.out.println("Hypotenuse = " +sqrt(a*a+b*b));
    }

    public static void main(String[] args){

    hypotenuse(3,4);
    }
}
