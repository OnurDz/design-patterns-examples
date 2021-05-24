// Subsystem class

import java.util.Random;

public class APISelector {
    TimeShiftingAPI ts;

    APISelector(int seed) {
        ts = selectAPI(seed);
    }

    void getAPI() {
        ts.getAPI();
    }

    TimeShiftingAPI selectAPI(int seed) {
        Random rnd = new Random(seed);
        int sel = rnd.nextInt(2);
        switch(sel) {
            case 1:
                return new ConcreteTimeShiftingAPIA();
            case 2:
                return new ConcreteTimeShiftingAPIB();
            default:
                return new ConcreteTimeShiftingAPIA();
        }
    }
}
