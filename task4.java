import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b;
        long c = 9;
        for (long i = 1; i < 1000000000;) {
            b = a / i;
            if (b < c && b > 0) {
                c = b;
            }
            i = i*10;
        }
        System.out.println(c);
    }
}