
import java.util.*;

public class TotalExpensesDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = sc.nextInt();

        System.out.print("Enter the price per item: ");
        double price= sc.nextDouble();

        double total = calculateTotal(quantity, price);
        System.out.println("Total expenses: Rs." + total);

        sc.close();
    }

    public static double calculateTotal(int quantity, double price) {
        double total = quantity * price;

        if (quantity > 50) {
            total-= total * 0.1; 
        } else if (quantity >= 25 && quantity <= 50) {
            total -= total * 0.05; 
        }

        return total;
    }
}