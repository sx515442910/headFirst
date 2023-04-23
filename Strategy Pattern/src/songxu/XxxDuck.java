package songxu;

public class XxxDuck extends Duck{
    public XxxDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("i am a xxx duck");
    }
}
