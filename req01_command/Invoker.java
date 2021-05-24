class Invoker {
    Command command;

    // Constructor
    Invoker(Command command) {
        this.command = command;
    }

    // Change the command Invoker holds
    void setCommand(Command newCommand) {
        command = newCommand;
    }

    // Invoke command
    void invoke() {
        command.execute();
    }
}
