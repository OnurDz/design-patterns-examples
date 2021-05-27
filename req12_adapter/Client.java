class Client {
    public static void main(String[] args) {
        System.out.println("Receiving WEBM stream. Need to use WEBM adapter.");
        WebmDecoder adaptee = new WebmDecoder();
        Decoder decoder = new WebmAdapter(adaptee);
        decoder.decode();
    }
}
