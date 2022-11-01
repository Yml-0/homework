import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        if ((y < (2 - x * x) && y > 0) && (y > x || y > 0 && x > 0)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
