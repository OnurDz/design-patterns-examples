class Element implements Flyweight {
    int key;

    Element(int key) {
        this.key = key;
    }

    public void draw() {
        System.out.println("Drawing the element with the ID " + key);
    }
}