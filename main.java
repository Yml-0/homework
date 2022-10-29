public class main {
    public static void main(String[] args) {
        Mouse Alex =  new Mouse();
        Hedgehog Sonic =  new Hedgehog();
        Fox Fink =  new Fox();
        Animals Max =  new Animals();
        Animals[] zoo = new Animals[4];
        zoo[0] = Alex;
        zoo[1] = Sonic;
        zoo[2] = Fink;
        zoo[3] = Max;
        for (Animals aboutAnimals: zoo) {
            aboutAnimals.movement();
        }
    }
}
