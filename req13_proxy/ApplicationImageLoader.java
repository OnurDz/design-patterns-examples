class ApplicationImageLoader {
    public static void main(String[] args) {
        Graphic image = new ImageProxy("./images/icon.png");
        System.out.println(image.getDimensions());
        image.load();
        image.draw();
        image.store("./images/drawable/icon.png");
    }
}
