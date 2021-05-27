import java.util.HashMap;

class ElementFactory {
    HashMap<Integer, Flyweight> flyweights;

    ElementFactory() {
        flyweights = new HashMap<Integer, Flyweight>();
    }

    Flyweight getElement(int key) {
        if(!flyweights.containsKey(key)) {
            flyweights.put(key, new Element(key));
        }
        
        return flyweights.get(key);
    }
}
