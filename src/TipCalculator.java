import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalCost = 0;
        int peopleNum;
        double tipPercent;
        int temp;
        double input = 0;

        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group? ");
        peopleNum = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100) ");
        temp = scan.nextInt();
        tipPercent = temp / 100.0;

        while (input != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g 12.50 (-1 to end) ");
            input = scan.nextDouble();
            if (input != -1 ) {
                totalCost = totalCost + input;
            }
        }

        System.out.println("Bill before tip " + totalCost);
    }
}
