public class ImageProxy implements Graphic {
    Image image;
    String filename;

    ImageProxy(String filename) {
        image = null;
        this.filename = filename;
    }

    private Image getImage() {
        if (image == null) {
            image = new Image(filename);
        }
        return image;
    }

    public void draw() {
        getImage().draw();
    }

    public int[] getDimensions() {
        return getImage().getDimensions();
    }

    public void store(String path) {
        getImage().store(path);
    }

    public void load() {
        getImage().load();
    }
    
}
