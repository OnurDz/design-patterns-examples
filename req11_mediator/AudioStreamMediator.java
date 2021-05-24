public class AudioStreamMediator implements Mediator {
    boolean streamState;
    AudioModule currentModule;

    AudioStreamMediator() {
        streamState = false;
        currentModule = null;
    }

    public boolean getAudioState() {
        return streamState;
    }

    public void setModule(AudioModule module) {
        if(streamState) {
            stopStream();
            currentModule = module;
            startStream();
        }
    }

    public void startStream() {
        if (currentModule != null) {
            currentModule.start();
            streamState = true;
        } else {
            System.err.println("No audio to start.");
        }
    }

    public void stopStream() {
        if (currentModule != null) {
            currentModule.stop();
            streamState = false;
        } else {
            System.err.println("No audio to stop.");
        }
        
    }
}
