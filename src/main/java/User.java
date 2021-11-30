public class User implements Runnable {

    Switch aSwitch;
    public static final int MAX_ITERATIONS = 5;
    public static final int TIME_TO_SLEEP = 1000;

    public User( Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void run() {
        for (int i = 1; i <= MAX_ITERATIONS; i++) {
            try {
                Thread.sleep(TIME_TO_SLEEP);
                aSwitch.onSwitch();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
       System.out.printf("%s завершил включения тумблера\n", Thread.currentThread().getName());
    }
}