package gof.patters.creational.builder;

public class ThingTwo {

    private String color;
    private String name;
    private int age;
    private int height;
    private String species;
    private boolean isCharismatic;
    private int degreesToKevinBacon;

    protected ThingTwo(
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


    public static class Builder {

        // required properties
        private String name;
        private String species;

        private String color;
        private int age;
        private int height;
        private boolean isCharismatic;
        private int degreesToKevinBacon;

        public Builder(String name, String species) {
            this.name = name;
            this.species = species;
        }


        public Builder setColor(String color) {
            this.color=color;
            return this;
        }

        public Builder setAge(int age) {
            this.age=age;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setIsCharismatic(boolean isCharismatic) {
            this.isCharismatic=isCharismatic;
            return this;
        }

        public Builder setDegreesToKevinBacon(int degreesToKevinBacon) {
            this.degreesToKevinBacon=degreesToKevinBacon;
            return this;
        }

        public ThingTwo build() {
            ThingTwo thing = new ThingTwo (
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

}
