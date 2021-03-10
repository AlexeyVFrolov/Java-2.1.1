import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the ticket price in rubles ");
        long ticketPrice = (long) (in.nextDouble() * 100); // ticket price, kopecks
        System.out.println(String.format("Your free miles accrued: %s", ticketPrice / 2000)); // 1 mile per 20 ruble
    }
}
