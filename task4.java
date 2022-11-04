import java.util.Scanner;

public class task4 {

    /* С массивами
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n+1];
        int[] bigger = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (nums[i+1] > nums[i]) bigger[i] = nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            if (bigger[i] != 0) System.out.print(bigger[i] + " ");
        }
    }
    */

    public static void main(String[] args) {    // Без массивов
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num1 = input.nextInt();
        for (int i = 1; i < n; i++) {
            int num2 = input.nextInt();
            if (num2 > num1) System.out.print(num2 + " ");
            num1 = num2;
        }
    }
}