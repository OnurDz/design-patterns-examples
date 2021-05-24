class TaskMenuButtonBuilder implements ButtonBuilder {

    public void buildIcon(int size) {
        System.out.println("Added small icon to button.");
    }

    public void buildText(int size) {
        System.out.println("Added large text to button.");
    }

    public void buildAnimation(int type) {
        System.out.println("Added sliding window animation trigger to button.");
    }
}
