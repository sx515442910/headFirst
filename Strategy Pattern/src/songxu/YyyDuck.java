package songxu;

public class YyyDuck extends Duck {

    public YyyDuck() {
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyWIthNoWay();
    }

    @Override
    void display() {
        System.out.println("i am a yyy Duck");
    }
}
