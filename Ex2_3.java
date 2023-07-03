import java.util.Scanner;
public class Ex2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight in pound : ");
        double pound = input.nextDouble();
        double kilo = pound * 0.45359237;

        System.out.print("Enter Heigth in inch : ");
        double inch = input.nextDouble();
        double meter = inch * 0.0254;

        double BMI = kilo / (meter * meter);
        System.out.println("BMI is " +BMI);
        input.close();

    }
}
