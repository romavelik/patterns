package abstractFactory.util;

import abstractFactory.factory.Factory;
import abstractFactory.factory.HondaFactory;
import abstractFactory.factory.NissanFactory;

public class Factories {
    public static Factory getFactory(FactoryType type){
        if (type==FactoryType.HONDA){
            return new HondaFactory();
        }else if(type==FactoryType.NISSAN){
            return new NissanFactory();
        }else
            return null;
    }
}
