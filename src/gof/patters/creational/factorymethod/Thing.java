package gof.patters.creational.factorymethod;

public class Thing {

    private Arm[] arms;

    public Thing() {
        // all things have three arms
        arms = new Arm[3];
        arms[0] = makeArm();
        arms[1] = makeArm();
        arms[2] = makeArm();
    }

    public Arm makeArm() {
        return new RegularArm();
    }

    public Arm[] getArms() {
        return arms;
    }


}
