class Client {
    public static void main(String[] args) {
        ElementFactory elementFactory = new ElementFactory();
        Flyweight element = elementFactory.getElement(98);
        element.draw();
    }
}
