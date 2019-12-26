package decorator;

public class DecoratorB extends Decorator{
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        System.out.println("DecoratorB's would like to add new thing before main info");
        System.out.println("It's done, now I'm leaving");
        component.doSomething();
        System.out.println("I've forgotten something... Bye-bye!");
    }
}
