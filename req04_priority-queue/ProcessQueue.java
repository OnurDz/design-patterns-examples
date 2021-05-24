import java.util.ArrayList;

class ProcessQueue implements PriorityQueue {
    final int HIGH = 3;
    final int MEDIUM = 2;
    final int LOW = 1;
    ArrayList<PQNode> processQueue;
    
    class PQNode {
        int pid;
        int priority;

        PQNode(int pid) {
            this.pid = pid;
            this.priority = MEDIUM;
        }
    }

    ProcessQueue() {
        processQueue = new ArrayList<PQNode>();
    }
    
    public int add(int pid) {
        if (this.contains(pid)) {
            processQueue.add(new PQNode(pid));
            return 0;
        }
        return -1;
    }

    public int remove() {
        for (PQNode pqNode : processQueue) {
            if (pqNode.priority == LOW) {
                processQueue.remove(pqNode);
                return 0;
            }
        }

        for (PQNode pqNode : processQueue) {
            if (pqNode.priority == MEDIUM) {
                processQueue.remove(pqNode);
                return 0;
            }
        }

        return -1;
    }

    public int setPriority(int pid, int prValue) {
        for (PQNode pqNode : processQueue) {
            if (pqNode.pid == pid) {
                pqNode.priority = prValue;
                return 0;
            }
        }
        return -1;
    }

    boolean contains(int pid) {
        for (PQNode pqNode : processQueue) {
            if (pqNode.pid == pid)
                return true;
        }
        return false;
    }

    void increasePriority(int pid) {
        for (PQNode pqNode : processQueue) {
            if (pqNode.pid == pid) {
                if (pqNode.priority < HIGH) {
                    pqNode.priority++;
                }
            }
        }
    }
}
