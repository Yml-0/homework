public class Fox extends Animals {
    String color = "Orange";

    public void food() {
        System.out.println("Питаюсь ежами");
    }

    @Override
    public void movement() {
        System.out.println("Быстро бегаю, особенно за ежами");
    }
}

