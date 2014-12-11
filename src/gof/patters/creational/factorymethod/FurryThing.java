package gof.patters.creational.factorymethod;

public class FurryThing extends Thing {

    @Override
    public Arm makeArm() {
        return new FurryArm();
    }

}
