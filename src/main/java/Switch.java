public class Switch {

    public static volatile boolean volatileVal;

    public void onSwitch() {
        if (!volatileVal) {
            System.out.println(Thread.currentThread().getName() + " включил тумблер!");
            volatileVal = true;
        }
    }

    public void offSwitch() {
        if (volatileVal) {
            System.out.println(Thread.currentThread().getName() + " тумблер выключила");
            volatileVal = false;
        }
    }
}

