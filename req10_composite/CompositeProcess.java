import java.util.ArrayList;

public class CompositeProcess extends Process {

    CompositeProcess() {
        alive = true;
        children = new ArrayList<Process>();
    }

    @Override
    void kill() {
        System.out.println("Killing the process along with children.");
        for (Process process : children) {
            process.kill();
        }

        alive = false;
    }

    @Override
    long getResource() {
        long resource = usedResource;
        for (Process process : children) {
            resource = resource + process.getResource();
        }

        return resource;
    }
}
