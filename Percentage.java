import java.util.Scanner;

class Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double one=sc.nextDouble();
        double second=sc.nextDouble();
        double three=sc.nextDouble();
        double four=sc.nextDouble();
        double five=sc.nextDouble();

        double percent=((one+second+three+four+five)/500)*100;
        System.out.println("Your Final Percentage is "+percent+"%");
    }
}
