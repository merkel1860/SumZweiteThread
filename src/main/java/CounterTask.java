public class CounterTask implements Runnable {
    private final Integer range;
    public static volatile Integer sum = 0;

    public CounterTask(Integer range) {
        this.range = range;
    }

    @Override
    public void run() {
        int lowerSide = this.range <= 50 ? 1 : 51;
        int halfSum = 0;
        for (int i = lowerSide; i <= range; i++) {
            halfSum += i;
        }
        synchronized (sum) {
            sum += halfSum;
        }
        System.out.println("HalfSum is [" + lowerSide + "," + range + "] : "
                + halfSum+" =>"+sum.toString());

    }
}
