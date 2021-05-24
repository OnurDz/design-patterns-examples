class ApplicationAudioModule1 implements AudioModule {
    Mediator mediator;

    ApplicationAudioModule1(Mediator m) {
        mediator = m;
    }

    public void start() {
        mediator.setModule(this);
        System.out.println("Application 1 has started streaming audio.");
    }

    public void stop() {
        System.out.println("Application 1 stopped the audio stream.");
    }
}
