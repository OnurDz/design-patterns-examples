class Memento {
    long state;

    Memento(long state) {
        setState(state);
    }

    long getState() {
        return state;
    }

    void setState(long state) {
        this.state = state;
    }

}
