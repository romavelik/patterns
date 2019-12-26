package decorator;

import java.util.Date;

public class DecoratorA extends Decorator {

    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        System.out.println("DecoratorA's added new thing");
        component.doSomething();
        System.out.println("...and here it is!");

    }
}
