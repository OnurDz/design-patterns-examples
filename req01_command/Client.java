public class Client {
    public static void main(String[] args) {
        OS os = new OS();
        SmartPhoneCommand spc = new SmartPhoneCommand(532, os);
        RemoteControlCommand rcc = new RemoteControlCommand(128, os);
        spc.execute();
        rcc.execute();
    }
}
