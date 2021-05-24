class LauncherButtonBuilder implements ButtonBuilder {

    public void buildIcon(int size) {
        System.out.println("Added large icon to button.");
    }

    public void buildText(int size) {
        System.out.println("Added small text to button.");
    }

    public void buildAnimation(int type) {
        System.out.println("Added enlarging animation trigger to button.");
    }
}
