class PngHandler extends ImageHandler {
    @Override
    void decompress() {
        System.out.println("Decompressing the PNG image");
    }
    
    @Override
    void analyze() {
        System.out.println("Analyzing the PNG image.");
    }
}
