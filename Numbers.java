import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        double largest = Double.MIN_VALUE;
        double smallest = Double.MAX_VALUE;

        System.out.println("Enter numbers (type 'exit' to stop):");

        while (true) {
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                count++;
                sum += number;
                largest = Math.max(largest, number);
                smallest = Math.min(smallest, number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers Entered");
        }

        sc.close();
    }
}
