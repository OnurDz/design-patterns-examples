class JpegHandler extends ImageHandler {
    @Override
    void decompress() {
        System.out.println("Decompressing the JPEG image");
    }
    
    @Override
    void analyze() {
        System.out.println("Analyzing the JPEG image.");
    }
}
