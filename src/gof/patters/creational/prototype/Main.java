package gof.patters.creational.prototype;

public class Main {

    public static  void  main(String[] args) {
        ThingCache cache = new ThingCache();
        Thing redThing = cache.getThing(Colors.RED);
        System.out.println(redThing.getColor());
        System.out.println("RED THING OBJECT ID: " + redThing);
        Thing blueThing = cache.getThing(Colors.BLUE);
        System.out.println(blueThing.getColor());
        System.out.println("BLUE THING OBJECT ID: " + blueThing);

    }

}
