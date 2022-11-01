import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        int rabbits = 11;
        int wolfs = 2;
        int eaten = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i != n+1; i++) {
            if (i%2 != 0) {
                rabbits = rabbits*3;
            } else if (i%2 == 0) {
                rabbits -= (wolfs*10);
                eaten += wolfs*10;
            }
            if (eaten >= 70) {
                wolfs += 1;
            }
        }
        System.out.println(rabbits + " " + wolfs);
    }
}