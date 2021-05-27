public class Image implements Graphic {
    String filename;
    int width;
    int height;

    Image(String filename) {
        this.filename = filename;
        width = 800;
        height = 600;
    }


    public void draw() {
        System.out.println("Drawing the image.");
    }

    public int[] getDimensions() {
        int[] dimensions = {width, height};
        return dimensions;
    }

    public void store(String path) {
        this.filename = path;
        System.out.println("Storing the image in " + path);
    }

    public void load() {
        System.out.println("Loading the image from " + filename);
    }
    
}
