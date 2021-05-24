public class ProfileAFactory extends ProfileFactory {
    @Override
    Profile factoryMethod() {
        return new ProfileA();
    }
}
