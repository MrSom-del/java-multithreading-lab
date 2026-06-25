public class ThreadSleepDemo {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {

            for(int i = 5; i >= 1; i--) {

                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Time Up!");
        });

        t.start();
    }
}
