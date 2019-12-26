package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.product.Car;
import abstractFactory.product.Plane;
import abstractFactory.util.Factories;
import abstractFactory.util.FactoryType;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factories.getFactory(FactoryType.NISSAN);
        Car car = factory.createCar();
        Plane plane = factory.createPlane();
        System.out.println(car.toString());
        System.out.println(plane.toString());
    }
}
