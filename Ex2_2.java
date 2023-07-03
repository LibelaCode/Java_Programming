import java.util.Scanner;
public class Ex2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate : ");

        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        double percentG = (subtotal * gratuity) / 100;
        double total = subtotal + percentG;
        
        System.out.println("The gratuity is " + percentG + "and total is " + total);
        input.close();
    }
}
