public class PersonalDetails {

    public static String name="Ruslan Charuh"; //instance variable, without "static" keyword
    public static String age="21";
    public static String address="231 Cadogan Street, London, SW1X 3PF";
    public static String dob="29 February 1998";

    static void personalDetails(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Address: " +address);
        System.out.println("Date of birth: " +dob);
    }


    public static void main(String[] args){
        personalDetails();
    }
}
