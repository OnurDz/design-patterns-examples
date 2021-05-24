class Application {
    long state;

    void setMemento(Memento m) {
        this.state = m.getState();
    }

    Memento createMemento() {
        return new Memento(state);
    }
}
