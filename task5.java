import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean aMatch = a % 5 == 0 && a / 100 > 0 && a / 100 < 10;
        boolean bMatch = b % 5 == 0 && b / 100 > 0 && b / 100 < 10;
        boolean cMatch = c % 5 == 0 && c / 100 > 0 && c / 100 < 10;
        boolean abc = aMatch && (bMatch || cMatch);
        boolean bac = bMatch && (aMatch || cMatch);
        boolean cab = cMatch && (aMatch || bMatch);
        if (abc || bac || cab) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
