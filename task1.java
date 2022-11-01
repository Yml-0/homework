import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int first, second;
        first = second = 1;
        int result = 0;
        for (int i = 2; i != a; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        System.out.println(result);
    }
}