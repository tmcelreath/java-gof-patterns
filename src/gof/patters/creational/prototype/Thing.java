package gof.patters.creational.prototype;

public abstract class Thing implements Cloneable {

    protected String color;

    public String getColor() {
        return this.color;
    }

    public abstract Thing getClone();

}
