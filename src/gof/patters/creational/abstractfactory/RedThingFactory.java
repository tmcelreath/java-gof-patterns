package gof.patters.creational.abstractfactory;

public class RedThingFactory implements ThingFactory {

    public Thing createThing() {
        return new RedThing();
    }

}

