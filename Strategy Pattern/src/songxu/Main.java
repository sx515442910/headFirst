package songxu;

public class Main {
    public static void main(String[] args) {
        XxxDuck xxxDuck = new XxxDuck();
        xxxDuck.display();
        xxxDuck.swim();
        xxxDuck.performFly();
        xxxDuck.performQuack();
        System.out.println("==============");
        YyyDuck yyyDuck = new YyyDuck();
        yyyDuck.display();
        yyyDuck.swim();
        yyyDuck.performFly();
        yyyDuck.performQuack();
    }
}
