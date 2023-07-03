import java.util.Scanner;
public class Ex2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount : ");
        
        double Money = input.nextDouble();
        double interest = 0.00417;
        double first = Money * (1 + interest);
        double second = (Money+first) * (1 + interest);
        double third = (Money+second) * (1 + interest);
        double fourth = (Money+third) * (1 + interest);
        double fifth = (Money+fourth) * (1 + interest);
        double sixth = (Money+fifth) * (1 + interest);

        System.out.println("After the sixth month, the account value is " +sixth);
        input.close();
    }
}
