public class Toy implements Runnable {

    Switch aSwitch;

    public Toy(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            aSwitch.offSwitch();
        }
    }
}
