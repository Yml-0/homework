public class Mouse extends Animals {
    private int speed = 12;
    
    public void food() {
        System.out.println("Ем всё, что попадётся");
    }

    @Override
    public void movement() {
        System.out.println("Крадёца");
    }

    public void isDanger(){
        System.out.println("Быстро бегит");
    }
    }