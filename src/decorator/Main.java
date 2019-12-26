package decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new DecoratorB(new DecoratorA(new ComponentImpl()));
        component.doSomething();
    }
}
