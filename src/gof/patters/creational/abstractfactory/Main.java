package gof.patters.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating an application with a Red Thing Factory");
        Application redApp = new Application(new RedThingFactory());
        redApp.doSomethingToSomeThing();

        System.out.println("Creating an application with a Blue Thing Factory");
        Application blueApp = new Application(new BlueThingFactory());
        blueApp.doSomethingToSomeThing();



    }
}
