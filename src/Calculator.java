public class Calculator {
    //inside the class - outside the method with "static" keyword
    static int x=24; //static/class variables
    static int y=8;

    //This method will perform addition
    static void add () {//no-return type, no argument user-defined method
        System.out.println(x+y);
    }

    //This method will perform subtraction
    static void sub () {//no-return type, no argument user-defined method
        System.out.println(x-y);
    }

    //This method will perform multiplication
    static void mult () {//no-return type, no argument user-defined method
        System.out.println(x*y);
    }

    //This method will perform division
    static void div () {//no-return type, no argument user-defined method
        System.out.println(x/y);
    }

    public static void main(String[] args) {
        add();
        sub();
        mult();
        div();
    }

}
