import java.util.ArrayList;

public class LeafProcess extends Process {
    LeafProcess() {
        alive = true;
        usedResource = 1024;
    }

    @Override
    void kill() {
        super.kill();
        System.out.println("Killed the process.");
    }

    @Override
    void add(Process p) {
        System.err.println("Cannot add child to a leaf process.");
    }

    @Override
    ArrayList<Process> getChild() {
        System.err.println("Leaf process has no children.");
        return null;
    }

}
