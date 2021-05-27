abstract class ImageHandler {

    void templateMethod() {
        decompress();
        extractPixels();
        analyze();
        extractColors();
        draw();
    }

    // Primitive methods 
    abstract void decompress();
    abstract void analyze();

    // Common methods
    private void draw() {
        System.out.println("Drawing the image to display.");
    }

    private void extractColors() {
        System.out.println("Extracting color values.");
    }

    private void extractPixels() {
        System.out.println("Extracting pixels.");
    }

}
