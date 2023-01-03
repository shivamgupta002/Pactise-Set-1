import java.util.Scanner;

class Cgpa{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double one=sc.nextDouble();
        double second=sc.nextDouble();
        double three=sc.nextDouble();

        double cgpa=((one+second+three)/300)*10;
        System.out.println("Your Final Percentage is "+cgpa);
    }
}
