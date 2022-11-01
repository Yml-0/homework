import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int a100 = a/100;
        int a10 = a%100/10;
        int a1 = a%10;
        int sumNums = a100 + a10 + a1;
        int a2 = a/2*2+2;
        System.out.println(sumNums + " " + a2);

    }
}