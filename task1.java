import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        byte[] array = new byte[n];
        for (byte i = 0; i < n; i++) {
            boolean b = input.nextBoolean();
            int myByte = (!b) ? 0 : 1;
            array[i] = (byte) (myByte | i);
        }
        for (int i = 0; i < array.length; i++) {
            int p = 0;
            boolean b = (i & (1 << p)) != 0;
            System.out.print(b + " ");
            ++p;
        }
    }
}