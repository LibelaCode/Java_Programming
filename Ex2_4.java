import java.util.Scanner;
public class Ex2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance : ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon : ");
        double miles = input.nextDouble();
        System.out.print("Enter price per gallon : ");
        double price = input.nextDouble();
        double total = (distance / miles) * price;
        System.out.println("The cost of driving is " +total);
        input.close();
    }
}
