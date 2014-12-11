package gof.patters.creational.builder;

public class Thing {

    private String color;
    private String name;
    private int age;
    private int height;
    private String species;
    private boolean isCharismatic;
    private int degreesToKevinBacon;

    public Thing(
            String color,
            String name,
            int age,
            int height,
            String species,
            boolean isCharismatic,
            int degreesToKevinBacon
    ) {
        this.color=color;
        this.name=name;
        this.age=age;
        this.height=height;
        this.species=species;
        this.isCharismatic=isCharismatic;
        this.degreesToKevinBacon=degreesToKevinBacon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isCharismatic() {
        return isCharismatic;
    }

    public void setCharismatic(boolean isCharismatic) {
        this.isCharismatic = isCharismatic;
    }

    public int getDegreesToKevinBacon() {
        return degreesToKevinBacon;
    }

    public void setDegreesToKevinBacon(int degreesToKevinBacon) {
        this.degreesToKevinBacon = degreesToKevinBacon;
    }

}
