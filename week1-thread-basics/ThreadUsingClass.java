public class ThreadUsingClass extends Thread {

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        ThreadUsingClass t1 = new ThreadUsingClass();
        t1.start();
    }
}
