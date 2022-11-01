import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        if (a >= -2d && a <= 3d || a >= 6d && a <= 9d) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}