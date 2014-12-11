package gof.patters.creational.prototype;

public class BlueThing extends Thing {

    public BlueThing() {
        this.color = "BLUE";
    }

    public BlueThing getClone() {
        try {
            return (BlueThing)this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
