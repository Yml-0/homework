import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // Рубли
        int b = input.nextInt(); // Копейки
        int n = input.nextInt(); // Пирожки
        int rub = a*n + b*n/100;
        int kop = b*n%100;
        System.out.println(rub + " " + kop);
    }
}