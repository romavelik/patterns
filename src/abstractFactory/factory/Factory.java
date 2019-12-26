package abstractFactory.factory;

import abstractFactory.product.Car;
import abstractFactory.product.Plane;

public interface Factory {
    Car createCar();
    Plane createPlane();
}
