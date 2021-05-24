class BigUIDecorator extends SettingsDecorator {
    public void apply() {
        applySettingsForUser();
        super.apply();
    }

    void applySettingsForUser() {
        System.out.println("Big UI is enabled for user.");
    }
}
