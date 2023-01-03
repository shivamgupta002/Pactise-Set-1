import java.util.Scanner;

class KmToMiles {
    public static void main(String[] args) {
        System.out.println("Convert Km in Mile");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Km which you want to convert in mile");
        double km=sc.nextDouble();
        double mile=km*0.621;
        System.out.println("Mile is "+mile);
    }
}
