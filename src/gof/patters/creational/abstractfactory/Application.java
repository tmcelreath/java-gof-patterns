package gof.patters.creational.abstractfactory;

public class Application {

    ThingFactory factory;

    public Application(ThingFactory factory) {
        this.factory = factory;
    }

    public void doSomethingToSomeThing() {
        Thing thing = factory.createThing();
        System.out.println("Creating a Thing of type: " +  thing.getClass().getName());
        String result = thing.doSomething();
        System.out.println("THING RESULT: " + result);
    }

}
