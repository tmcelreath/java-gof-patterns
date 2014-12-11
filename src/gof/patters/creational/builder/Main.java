package gof.patters.creational.builder;

public class Main {

    public static void main(String[] args) {

            ThingBuilder builder = new ThingBuilder("Huckleberry", "Hound");
            Thing huck =
                    builder
                            .setAge(10)
                            .setColor("Blue")
                            .setDegreesToKevinBacon(6)
                            .setHeight(4)
                            .setIsCharismatic(true)
                            .build();

            ThingTwo top_cat =
                    new ThingTwo.Builder("TC", "CAT")
                            .setAge(40)
                            .setColor("Yellow")
                            .setDegreesToKevinBacon(2)
                            .setIsCharismatic(true)
                            .setHeight(47)
                            .build();
    }
}
