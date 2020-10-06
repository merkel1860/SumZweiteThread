import org.omg.PortableServer.THREAD_POLICY_ID;

public class PlayBook {

    public static void main(String[] argv) {
        CounterTask ct1 = new CounterTask(50);
        CounterTask ct2 = new CounterTask(100);
        Thread a = new Thread(ct1);
        Thread b = new Thread(ct2);

        a.start();
        b.start();
        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The sum is [1,100] : " + CounterTask.sum.toString());
//        int test = 0;
//        for(int i=1; i<=100;i++){
//            test+=i;
//
//        }
//        System.out.println(String.valueOf(test));
    }
}
