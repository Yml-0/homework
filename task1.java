import java.util.Scanner;

public  classtask1 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in );
        short m = in.nextShort();
        System.out.print((m / 100)+(m%100/10)+(m%10) + " ");
        System.out.println(m + 2-m%2);
    }
}
