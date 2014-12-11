package gof.patters.creational.singleton;

public enum Thing {

    INSTANCE;

    private String color = "RED";

    public String getColor() {
        return this.color;
    }

}
