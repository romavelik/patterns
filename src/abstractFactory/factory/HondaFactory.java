package abstractFactory.factory;

import abstractFactory.product.Car;
import abstractFactory.product.Honda;
import abstractFactory.product.HondaPlane;
import abstractFactory.product.Plane;

public class HondaFactory implements Factory {
    @Override
    public Car createCar() {
        return new Honda();
    }

    @Override
    public Plane createPlane() {
        return new HondaPlane();
    }
}
