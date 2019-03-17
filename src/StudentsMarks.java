public class StudentsMarks {

    //This method prints total and the average of three given marks
    static void totalMarks(double a,double b, double c){
        System.out.println("Marks Total = " +(a+b+c));
        System.out.println("Marks Average = " +(a+b+c)/3);
        }

    public static void main(String[] args){
        totalMarks(60,62,67);

    }
}
