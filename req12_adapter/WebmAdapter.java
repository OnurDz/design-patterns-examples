class WebmAdapter implements Decoder {
    WebmDecoder adaptee;

    WebmAdapter(WebmDecoder adaptee) {
        this.adaptee = adaptee;
    }

    public void decode() {
        adaptee.decodeWebm();
    }
}
