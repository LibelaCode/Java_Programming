import java.lang.Math;
import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side : ");

        double side = input.nextDouble();
        double area = (side*side*3*Math.sqrt(3))/2;

        System.out.println("The area of the hexagon is " +area);
        input.close();
    }
}
