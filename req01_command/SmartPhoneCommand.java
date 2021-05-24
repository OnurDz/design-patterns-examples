class SmartPhoneCommand implements Command {
    int state;
    int actionId;
    OS receiver;

    SmartPhoneCommand(int actionId, OS receiver) {
        state = 0;
        this.actionId = actionId;
        this.receiver = receiver;
    }

    public void setReceiver(OS receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        System.out.println("Executing a smartphone command.");
        receiver.action(actionId);
    }
}
