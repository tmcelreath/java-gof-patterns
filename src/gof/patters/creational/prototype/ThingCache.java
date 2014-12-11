package gof.patters.creational.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThingCache {

    private Map<Colors, Thing> cache;

    public ThingCache() {
        cache = new ConcurrentHashMap<Colors, Thing>();
        cache.put(Colors.BLUE, new BlueThing());
        System.out.println("CACHED BLUE THING: " + cache.get(Colors.BLUE));
        cache.put(Colors.RED, new RedThing());
        System.out.println("CACHED RED THING: " + cache.get(Colors.RED));
    }

    public Thing getThing(Colors color) {
         return cache.get(color).getClone();
    }

}
