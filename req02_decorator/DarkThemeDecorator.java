class DarkThemeDecorator extends SettingsDecorator {
    @Override
    public void apply() {
        applySettingsForUser();
        super.apply();
    }

    void applySettingsForUser() {
        System.out.println("Dark theme is enabled for user.");
    }
}
