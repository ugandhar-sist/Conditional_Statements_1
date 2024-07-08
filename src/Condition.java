import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double ans;
        if (number > 250) {
            ans = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (number - 250) * 1.50;
        } else if (number > 150) {
            ans = (50 * 0.50) + (100 * 0.75) + (number - 150) * 1.20;
        } else if (number > 50) {
            ans = (50 * 0.50) + (number - 50) * 0.75;
        } else {
            ans = number * 0.5;
        }
        ans = ans + (ans * 0.2);
        System.out.printf("%.2f", ans);
    }
}
