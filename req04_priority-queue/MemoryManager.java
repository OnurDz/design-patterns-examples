class MemoryManager {
    ProcessQueue pq;

    MemoryManager() {
        pq = new ProcessQueue();
    }

    void manage() {
        pq.remove();
    }

    void prioritize(int pid) {
        pq.increasePriority(pid);
    }
}
