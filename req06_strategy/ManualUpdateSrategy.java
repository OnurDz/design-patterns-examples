class ManualUpdateStrategy implements Strategy {
    public void trigger() {
        System.out.println("Sending user confirmation for updates. User will see their updates in the UI.");
        System.out.println("Update operations will start after user chooses to continue.");
    }
}
