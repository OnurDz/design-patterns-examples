import java.util.ArrayList;

public class Process {
    boolean alive;
    ArrayList<Process> children;
    long usedResource;

    Process() {
        alive = false;
        children = new ArrayList<Process>();
        usedResource = 0;
        usedResource = 512;
    }

    void kill() {
        alive = false;
    }

    void add(Process p) {
        children.add(p);
    }

    ArrayList<Process> getChild() {
        return children;
    }

    long getResource() {
        return usedResource;
    }
}
