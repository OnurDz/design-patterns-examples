class Context {
    final int AUTO = 0;
    final int MANUAL = 1;
    Strategy strategy;

    Context() {
       setState(AUTO); // Default is Auto-update
    }

    void request() {
        System.out.println("Context: Triggering updates.");
        strategy.trigger();
    }

    void setState(int st) {
        switch (st) {
            case 0:
                strategy = new AutoUpdateStrategy();
                break;
            case 1:
                strategy = new ManualUpdateStrategy();
                break;
        }
    }
}
