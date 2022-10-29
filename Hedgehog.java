public class Hedgehog extends Animals {
    private String mainEnemy = "Лиса";
    private int maxAge = 7;

    public String getMainEnemy() {
        return mainEnemy;
    }
    
    public int getMaxAge() {
        return maxAge;
    }
    
    public void flying() {
        System.out.println("Ёж - птица гордая, пока не пнёшь - не полетит"); // Фанд золотых цитат моего физика
    }

    public void food() {
        System.out.println("Кушаю букашек");
    }
    
    @Override
    public void movement() {
        System.out.println("Быстро бегаю");
    }
}
    