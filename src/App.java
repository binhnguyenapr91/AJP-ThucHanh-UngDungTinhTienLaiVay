import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        money = scanner.nextDouble();
        System.out.println("Enter number of months:");
        month = scanner.nextInt();
        System.out.println("Enter annual interst rate in percentage:");
        interset_rate = scanner.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
