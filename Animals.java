import java.util.Scanner;

public class Animals {
    Scanner in = new Scanner(System.in);
    protected int legs = 4;
    int size = 20;
    private int mouth = 1;

    public void breath() {
        System.out.println("Дышу воздухом");
    }

    public void movement() {
        System.out.println("Хожу на лапах");
    }
}
