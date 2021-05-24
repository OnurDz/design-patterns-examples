public class Client {
    public static void main(String[] args) {
        Process root = new CompositeProcess();
        Process child = new CompositeProcess();
        Process childLeaf = new LeafProcess();
        Process childChildLeaf = new LeafProcess();

        root.add(child);
        root.add(childLeaf);
        child.add(childChildLeaf);

        child.getResource();
        root.getResource();
    }
}
