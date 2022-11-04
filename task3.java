import java.util.Scanner;

public class task3 {

    /* С массивами
    public static void main(String[] args) {
        int min = 9;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (numbers[i] < min && numbers[i] > 0) min = numbers[i];
            if (min == 1) break;
        }
        System.out.println(min);
    }
    */

        public static void main(String[] args) {    // Без массивов
        int min = 9;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int inputNumber = input.nextInt();
            if (inputNumber < min && inputNumber > 0) min = inputNumber;
            if (min == 1) break;
        }
        System.out.println(min);
    }
}