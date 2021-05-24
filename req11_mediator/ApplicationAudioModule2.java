public class ApplicationAudioModule2 implements AudioModule {
    Mediator mediator;

    ApplicationAudioModule2(Mediator m) {
        mediator = m;
    }

    public void start() {
        mediator.setModule(this);
        System.out.println("Application 2 has started streaming audio.");
    }

    public void stop() {
        System.out.println("Application 2 stopped the audio stream.");
    }
}
