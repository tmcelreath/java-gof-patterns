package gof.patters.creational.prototype;

public class RedThing extends Thing {

    public RedThing() {
        this.color = "RED";
    }

    public RedThing getClone() {
        try {
            return (RedThing)this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
