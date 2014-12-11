package gof.patters.creational.builder;

public class ThingBuilder implements Builder<Thing> {

    private String color;
    private String name;
    private int age;
    private int height;
    private String species;
    private boolean isCharismatic;
    private int degreesToKevinBacon;


    public ThingBuilder(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public ThingBuilder setColor(String color) {
        this.color=color;
        return this;
    }

    public ThingBuilder setAge(int age) {
        this.age=age;
        return this;
    }

    public ThingBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public ThingBuilder setIsCharismatic(boolean isCharismatic) {
        this.isCharismatic=isCharismatic;
        return this;
    }

    public ThingBuilder setDegreesToKevinBacon(int degreesToKevinBacon) {
        this.degreesToKevinBacon=degreesToKevinBacon;
        return this;
    }

    public Thing build() {
        Thing thing = new Thing(
                this.color,
                this.name,
                this.age,
                this.height,
                this.species,
                this.isCharismatic,
                this.degreesToKevinBacon
        );
        return thing;
    }




}
