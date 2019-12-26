package abstractFactory.factory;

import abstractFactory.product.Car;
import abstractFactory.product.Nissan;
import abstractFactory.product.NissanPlane;
import abstractFactory.product.Plane;

public class NissanFactory implements Factory{
    @Override
    public Car createCar() {
        return new Nissan();
    }

    @Override
    public Plane createPlane() {
        return new NissanPlane();
    }
}
