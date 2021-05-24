import java.util.HashMap;

public class FlyweightFactory {
    HashMap<Integer, Flyweight> flyweights;

    FlyweightFactory() {
        flyweights = new HashMap<Integer, Flyweight>();
    }

    Flyweight getFlyweight(Integer key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            flyweights.put(key, new SharedUIElement());
            return flyweights.get(key);
        }
    }
}
