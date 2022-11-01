import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int hours = a/60/60;
        int minutes = a/60%60;
        int seconds = a%60%60;
        System.out.printf(hours + ":" + "%02d" + ":" + "%02d", minutes, seconds);
    }
}