package gof.patters.creational.factorymethod;

public class Main {

    public static void main(String[] args) {

        Thing thing1 = new Thing();
        Thing thing2 = new FurryThing();

        System.out.println(thing1.getArms()[0].getClass().getName());
        System.out.println(thing2.getArms()[0].getClass().getName());


    }
}
