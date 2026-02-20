import java.util.*;
public class CURRENCY_CONVERTER_TASK_4 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // Exchange rates (1 USD = ?)
    double usdToEur = 0.92;
    double usdToGbp = 0.79;
    double usdToInr = 83.0;
    double usdToJpy = 149.50;
    double usdToCad = 1.36;

    // Show currency options
    System.out.println("--- Currency Converter ---");
    System.out.println("1. USD to EUR");
    System.out.println("2. USD to GBP");
    System.out.println("3. USD to INR");
    System.out.println("4. USD to JPY");
    System.out.println("5. USD to CAD");
    System.out.print("Choose conversion (1-5): ");
    int choice = scanner.nextInt();

    // Get amount
    System.out.print("Enter amount in USD: $");
    double amount = scanner.nextDouble();

    // Convert based on choice
    double result = 0;
    String currencyName = "";

    switch (choice) {
        case 1:
            result = amount * usdToEur;
            currencyName = "EUR";
            break;
        case 2:
            result = amount * usdToGbp;
            currencyName = "GBP";
            break;
        case 3:
            result = amount * usdToInr;
            currencyName = "INR";
            break;
        case 4:
            result = amount * usdToJpy;
            currencyName = "JPY";
            break;
        case 5:
            result = amount * usdToCad;
            currencyName = "CAD";
            break;
        default:
            System.out.println("Invalid choice.");
            return;
    }

    // Display result
    System.out.println("\n--- Result ---");
    System.out.println("$" + amount + " USD = " + result + " " + currencyName);

    scanner.close();
}
}
