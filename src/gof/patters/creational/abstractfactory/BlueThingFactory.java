package gof.patters.creational.abstractfactory;

public class BlueThingFactory implements ThingFactory {

    public Thing createThing() {
        return new BlueThing();
    }

}

