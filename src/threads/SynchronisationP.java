package threads;

public class SynchronisationP {

    private int count;

    SynchronisationP(int c) {
        count = c;
    }

    synchronized public void incValue(int offset) {
        count += offset;
    }

    synchronized public void decValue(int offset) {
        count -= offset;
    }

    synchronized public int getValue() {
        return count;
    }
}
